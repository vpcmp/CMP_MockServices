package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.accountServices.AcctStatementServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/accounts/balance")
@RequiredArgsConstructor

public class AcctStatementController {
    private final AcctStatementServices acctStatementServices;

    @GetMapping
    String getAcctStatementServices(@RequestParam("id") String id) {
        return acctStatementServices.getAcctStatementServices(id);
    }
}
