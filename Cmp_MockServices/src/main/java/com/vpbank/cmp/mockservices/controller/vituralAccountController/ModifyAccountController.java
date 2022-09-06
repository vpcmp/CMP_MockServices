package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.CreateAccount;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ModifyAccountServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/modify")
@RequiredArgsConstructor
public class ModifyAccountController {

    private final ModifyAccountServices modifyAccountServices;

    @PostMapping
    String modifyaccount(@ModelAttribute CreateAccount createAccount) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return modifyAccountServices.modifyAccountServices();

    };

}
