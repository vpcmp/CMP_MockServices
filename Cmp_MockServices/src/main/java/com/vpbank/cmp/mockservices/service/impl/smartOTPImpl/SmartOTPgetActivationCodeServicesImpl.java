package com.vpbank.cmp.mockservices.service.impl.smartOTPImpl;

import com.vpbank.cmp.mockservices.service.smartOTPServices.SmartOTPgetActivationCodeServices;
import org.springframework.stereotype.Service;


@Service
public class SmartOTPgetActivationCodeServicesImpl implements SmartOTPgetActivationCodeServices {
    @Override
    public String getsmartOTPgetActivationCodeServices() {
        return "{\n" +
                "    \"activationCode\": \"835358\"\n" +
                "}";
    }

}
