//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.model.PaymentExternal;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentExternalServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/payments/v1/cash/transfer/external")
@RequiredArgsConstructor
public class PaymentExternalController {

    private final PaymentExternalServices getpaymentExternalServices;

    @PostMapping
    String getpaymentExternal(@ModelAttribute PaymentExternal paymentExternal) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return getpaymentExternalServices.getpaymentExternalServices();

    };

}
