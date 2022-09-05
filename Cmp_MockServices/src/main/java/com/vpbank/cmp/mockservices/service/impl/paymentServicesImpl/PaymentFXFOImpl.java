package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.PaymentFXFOServices;
import org.springframework.stereotype.Service;


@Service

public class PaymentFXFOImpl implements PaymentFXFOServices {
    @Override
    public String getpaymentFXFOServices() {
        return "'{\n" +
                "    \"rateList\": [\n" +
                "        {\n" +
                "            \"buyRate\": \"23053.0000\",\n" +
                "            \"currency\": \"USD\",\n" +
                "            \"middRate\": \"22955.0000\",\n" +
                "            \"sellRate\": \"22856.0000\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
