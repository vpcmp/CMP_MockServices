package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.ClosureAccount;
import com.vpbank.cmp.mockservices.model.StatementAccount;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ClosureAccountServices;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.StatementAccountServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/statement")
@RequiredArgsConstructor
public class StatementAccountController {

    private final StatementAccountServices statementAccountServices;

    @PostMapping
    String statementaccount(@ModelAttribute StatementAccount statementAccount) throws InterruptedException {
        Common.getDelay();
        return statementAccountServices.statementAccountServices();

    };

}
