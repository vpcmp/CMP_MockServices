//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.model.PaymentFXFO;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentFXFOServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/payments/v1/cash/rate/exchange")
@RequiredArgsConstructor
public class PaymentFXFOController {

    private final PaymentFXFOServices getpaymentFXFOServices;

    @PostMapping
    String getpaymentFXFOServices(@ModelAttribute PaymentFXFO paymentFXFO) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return getpaymentFXFOServices.getpaymentFXFOServices();

    };

}
