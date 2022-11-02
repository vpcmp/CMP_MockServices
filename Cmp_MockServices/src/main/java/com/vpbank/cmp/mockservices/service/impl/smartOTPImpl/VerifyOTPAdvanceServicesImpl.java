package com.vpbank.cmp.mockservices.service.impl.smartOTPImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.smartOTPServices.VerifyOTPAdvanceServices;
import org.springframework.stereotype.Service;


@Service
public class VerifyOTPAdvanceServicesImpl implements VerifyOTPAdvanceServices {
    @Override
    @LogExecutionTime
    public String verifyOTPAdvanceServices() {
        return "{\n" +
                "    \"resultCode\": \"0\",\n" +
                "    \"resultMsg\": \"Success\"\n" +
                "}";
    }

}
