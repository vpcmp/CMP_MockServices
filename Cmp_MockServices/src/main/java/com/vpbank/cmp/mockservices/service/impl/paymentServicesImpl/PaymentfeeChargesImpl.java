package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.PaymentfeeChargesServices;
import org.springframework.stereotype.Service;


@Service

public class PaymentfeeChargesImpl implements PaymentfeeChargesServices {
    @Override
    public String getpaymentfeeChargesServices() {
        return "'{\n" +
                "    \"transactionId\": \"CHG212219BFYP\"\n" +
                "}";
    }
}
