package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.model.PaymentSMS;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentSMSServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cas/cashs/payments/notification/sms")
@RequiredArgsConstructor
public class PaymentSMSController {

    private final PaymentSMSServices getpaymentsmsServices;

    @PostMapping
    String getPaymentSMSServices(@ModelAttribute PaymentSMS payment) throws InterruptedException {
       Common.Delay();
        return getpaymentsmsServices.getpaymentsmsServices();

    };

}
