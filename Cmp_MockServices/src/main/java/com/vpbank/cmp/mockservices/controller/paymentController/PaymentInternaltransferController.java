package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.model.PaymentInternaltransfer;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentInternaltransferServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/payments/v1/cash/transfer/internal")
@RequiredArgsConstructor
public class PaymentInternaltransferController {

    private final PaymentInternaltransferServices getpaymentInternaltransferServices;

    @PostMapping
    String getpaymentInternaltransfer(@ModelAttribute PaymentInternaltransfer paymentInternaltransfer) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return getpaymentInternaltransferServices.getpaymentInternaltransferServices();

    }

}
