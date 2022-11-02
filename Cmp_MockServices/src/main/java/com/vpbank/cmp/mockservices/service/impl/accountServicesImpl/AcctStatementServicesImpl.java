package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.accountServices.AcctStatementServices;
import org.springframework.stereotype.Service;

@Service
public class AcctStatementServicesImpl implements AcctStatementServices{
    @Override
    @LogExecutionTime
    public String getAcctStatementServices(String id){
        return "{\n" +
                "    \"customerCode\": \"76829\",\n" +
                "    \"accountNumber\": \"168769\",\n" +
                "    \"openBalance\": \"11720455985\",\n" +
                "    \"closeBalance\": \"11720450702\",\n" +
                "    \"lockAmount\": \"0\"\n" +
                "}";
    }
}
