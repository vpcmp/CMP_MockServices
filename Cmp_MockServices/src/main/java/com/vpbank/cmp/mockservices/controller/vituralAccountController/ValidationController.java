package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.CreateAccount;
import com.vpbank.cmp.mockservices.model.Validation;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ModifyAccountServices;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ValidationServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/validate")
@RequiredArgsConstructor
public class ValidationController {

    private final ValidationServices validationServices;

    @PostMapping
    String validationservices(@ModelAttribute Validation validation) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return validationServices.validationServices();

    }

}
