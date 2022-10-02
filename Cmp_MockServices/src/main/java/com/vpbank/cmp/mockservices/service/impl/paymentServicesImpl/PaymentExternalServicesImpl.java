package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.PaymentExternalServices;
import org.springframework.stereotype.Service;


@Service
public class PaymentExternalServicesImpl implements PaymentExternalServices {
    @Override
    public String getpaymentExternalServices() {
        return "{\n" +
                "    \"referenceNumber\": \"2233444558899999412\",\n" +
                "    \"transactionId\": \"FT21232BDAK00020\",\n" +
                "    \"transferResult\": \"complete\",\n" +
                "    \"status\": \"complete\"\n" +
                "}";
    }

}
