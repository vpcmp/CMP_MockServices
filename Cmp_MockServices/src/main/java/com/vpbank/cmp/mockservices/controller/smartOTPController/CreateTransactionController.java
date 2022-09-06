package com.vpbank.cmp.mockservices.controller.smartOTPController;

import com.vpbank.cmp.mockservices.model.CreateTransaction;
import com.vpbank.cmp.mockservices.service.smartOTPServices.CreateTransactionServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/payments/sotp/txn-create")
@RequiredArgsConstructor
public class CreateTransactionController {

    private final CreateTransactionServices createTransactionServices;

    @PostMapping
    String getcreateTransaction(@ModelAttribute CreateTransaction createTransaction) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return createTransactionServices.createTransactionServices();

    };

}
