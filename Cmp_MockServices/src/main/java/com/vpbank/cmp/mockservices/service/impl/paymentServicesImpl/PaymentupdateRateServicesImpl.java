package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.PaymentupdateRateServices;
import org.springframework.stereotype.Service;
@Service
public class PaymentupdateRateServicesImpl implements PaymentupdateRateServices {
    @Override
    public String getpaymentupdateRateServices() {
        return "{\n" +
                "    \"resultCode\": \"0\",\n" +
                "    \"resultMsg\": \"Success\"\n" +
                "}";
    }

}
