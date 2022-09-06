package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.ClosureAccount;
import com.vpbank.cmp.mockservices.model.CreateAccount;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ClosureAccountServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/virtual-account/closure")
@RequiredArgsConstructor
public class ClosureAccountController {

    private final ClosureAccountServices closureAccountServices;

    @PostMapping
    String closureaccount(@ModelAttribute ClosureAccount closureAccount) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return closureAccountServices.closureAccountServices();

    }

}
