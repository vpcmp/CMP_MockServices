package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.PaymentExternalServices;
import org.springframework.stereotype.Service;


@Service
public class PaymentExternalServicesImpl implements PaymentExternalServices {
    @Override
    public String getpaymentExternalServices() {
        return "{\n" +
                "    \"resultCode\": \"200\",\n" +
                "    \"resultMsg\": \"complete\",\n" +
                "    \"transactionId\": \"FT21225KBB000003\",\n" +
                "    \"status\": \"complete\"\n" +
                "}";
    }

}
