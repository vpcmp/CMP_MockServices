package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.paymentServices.BankListServices;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentSMSServices;
import org.springframework.stereotype.Service;


@Service
public class PaymentSMSServicesImpl implements PaymentSMSServices {
    @Override
    @LogExecutionTime
    public String getpaymentsmsServices() {
        return "{\n" +
                "    \"resultCode\": \"0\",\n" +
                "    \"resultMsg\": \"Success\"\n" +
                "}";
    }

}
