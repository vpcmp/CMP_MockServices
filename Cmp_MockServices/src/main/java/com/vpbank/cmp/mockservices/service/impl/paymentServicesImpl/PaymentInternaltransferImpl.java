package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentInternaltransferServices;
import org.springframework.stereotype.Service;


@Service

public class PaymentInternaltransferImpl implements PaymentInternaltransferServices {
    @Override
    @LogExecutionTime
    public String getpaymentInternaltransferServices() {
        return "{\n" +
                "    \"referenceNumber\": \"C79725082203112219\",\n" +
                "    \"transactionId\": \"FT21232579872806\",\n" +
                "    \"transferResult\": \"complete\",\n" +
                "    \"status\": \"complete\"\n" +
                "}";
    }


}
