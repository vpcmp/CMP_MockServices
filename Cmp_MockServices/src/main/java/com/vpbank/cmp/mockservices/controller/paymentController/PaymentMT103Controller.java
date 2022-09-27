package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.model.PaymentMT103;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentMT103Services;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/payments/v1/cash/transfer/cross-border")
@RequiredArgsConstructor
public class PaymentMT103Controller {

    private final PaymentMT103Services getpaymentmt103Services;

    @PostMapping
    String getPaymentMT103(@ModelAttribute PaymentMT103 paymentmt103) throws InterruptedException {
        Common.Delay();
        return getpaymentmt103Services.getpaymentmt103Services();

    };

}
