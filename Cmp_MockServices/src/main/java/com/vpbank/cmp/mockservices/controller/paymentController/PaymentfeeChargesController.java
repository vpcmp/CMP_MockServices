//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.model.PaymentfeeCharges;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentfeeChargesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cas/cashs/1.0/payments/fees/charges")
@RequiredArgsConstructor
public class PaymentfeeChargesController {

    private final PaymentfeeChargesServices getPaymentfeeChargesServices;

    @PostMapping
    String getpaymentfeeChargesServices(@ModelAttribute PaymentfeeCharges paymentfeeCharges) throws InterruptedException {
        Common.Delay();
        return getPaymentfeeChargesServices.getpaymentfeeChargesServices();

    };

}
