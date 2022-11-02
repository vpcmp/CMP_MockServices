package com.vpbank.cmp.mockservices.service.impl.smartOTPImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.smartOTPServices.SmartOTPgetActivationCodeServices;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;


@Service
public class SmartOTPgetActivationCodeServicesImpl implements SmartOTPgetActivationCodeServices {
    @Override
    @LogExecutionTime

    public String getsmartOTPgetActivationCodeServices() {
        return "{\n" +
                "    \"activationCode\": \"" +
                RandomStringUtils.randomNumeric(6) +
                "\"\n}";
    }

}
