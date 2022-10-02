package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.vpbank.cmp.mockservices.config.AccountBalancesConfig;
import com.vpbank.cmp.mockservices.config.AccountBalancesConfig.AccountBalance;
import com.vpbank.cmp.mockservices.service.accountServices.AcctDetailServices;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.BenInforServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Log4j2
@RequiredArgsConstructor
public class BenInforServicesImpl implements BenInforServices {
       @Override
    public String getbenInforServices(String benNumber) {
        return "{\n" +
                "    \"interfaceId\": \"VAVALIDATE_E_VALIDATION\",\n" +
                "    \"channelId\": \"API\",\n" +
                "    \"bankEntityId\": \"IGTBVN\",\n" +
                "    \"masterAccountNumber\": \"VND1301400050001\",\n" +
                "    \"vaName\": \"\",\n" +
                "    \"vaStatus\": \"A\",\n" +
                "    \"vanMaster\": \"CMP\",\n" +
                "    \"customerName\": \"HAI NGUYEN THI THU VN HAI NGUYEN THI THU VN 2\",\n" +
                "    \"accountType\": \"CA\",\n" +
                "    \"currency\": \"VND\",\n" +
                "    \"vaNumber\": \"C012345\",\n" +
                "    \"status\": \"SUCCESS\",\n" +
                "    \"errorCode\": \"\",\n" +
                "    \"errorMessage\": \"\"\n" +
                "}";
    }


}
