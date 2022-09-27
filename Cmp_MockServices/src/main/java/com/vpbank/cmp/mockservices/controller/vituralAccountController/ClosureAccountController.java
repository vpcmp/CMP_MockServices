package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.ClosureAccount;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ClosureAccountServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/closure")
@RequiredArgsConstructor
public class ClosureAccountController {

    private final ClosureAccountServices closureAccountServices;

    @PostMapping
    String closureaccount(@ModelAttribute ClosureAccount closureAccount) throws InterruptedException {
        Common.Delay();
        return closureAccountServices.closureAccountServices();

    }

}
