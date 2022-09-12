package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.CreateAccount;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.CreateAccountServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/create")
@RequiredArgsConstructor
public class CreateAccountController {

    private final CreateAccountServices createAccountServices;

    @PostMapping
    String createaccount(@ModelAttribute CreateAccount createAccount) throws InterruptedException {
        Common.getDelay();
        return createAccountServices.createAccountServices();

    };

}
