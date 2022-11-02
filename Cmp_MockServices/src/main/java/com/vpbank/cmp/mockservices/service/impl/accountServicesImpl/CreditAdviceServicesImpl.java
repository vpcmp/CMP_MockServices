package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.accountServices.CreditAdviceServices;
import org.springframework.stereotype.Service;

@Service
public class CreditAdviceServicesImpl implements CreditAdviceServices{
    @Override
    @LogExecutionTime
    public String getCreditAdviceServices(String debitCreditFlag, String id){
        return "{\n" +
                "    \"transCode\": \"FT21228423311762\",\n" +
                "    \"currency\": \"VND\",\n" +
                "    \"debitAcctNo\": \"\",\n" +
                "    \"debitAcctName\": \"CHI THU HAI\",\n" +
                "    \"debitAcctBank\": \"VPBANK\",\n" +
                "    \"debitAcctBranch\": \"VPBANK AN GIANG\",\n" +
                "    \"creditAcctNo\": \"\",\n" +
                "    \"creditAcctName\": \"\",\n" +
                "    \"creditAcctBank\": \"\",\n" +
                "    \"creditAcctBranch\": \"\",\n" +
                "    \"amountInNumber\": \"VND1000000\",\n" +
                "    \"amountInWord\": \"\",\n" +
                "    \"transDetails\": \"NA\"\n" +
                "}";
    }
}
