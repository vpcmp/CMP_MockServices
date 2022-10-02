package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.PaymentMT103Services;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentSMSServices;
import org.springframework.stereotype.Service;


@Service
public class PaymentMT103ServicesImpl implements PaymentMT103Services {
    @Override
    public String getpaymentmt103Services() {
        return "{\n" +
                "    \"resultCode\": \"200\",\n" +
                "    \"resultMsg\": \"complete\",\n" +
                "    \"transactionId\": \"FT21232HGM000001\",\n" +
                "    \"status\": \"complete\"\n" +
                "}";
    }

}
