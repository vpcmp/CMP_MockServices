package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.service.accountServices.CreditAdviceServices;
import org.springframework.stereotype.Service;

@Service
public class CreditAdviceServicesImpl implements CreditAdviceServices{
    @Override
    public String getCreditAdviceServices(String id){
        return "{\n" +
                "    \"advicesList\": [\n" +
                "        {\n" +
                "            \"transCode\": \"TT2209209977\",\n" +
                "            \"currency\": \"\",\n" +
                "            \"debitAcctNo\": \"\",\n" +
                "            \"debitAcctName\": \"\",\n" +
                "            \"debitAcctBank\": \"VPBANK\",\n" +
                "            \"debitAcctBranch\": \"\",\n" +
                "            \"creditAcctNo\": \"\",\n" +
                "            \"creditAcctName\": \"\",\n" +
                "            \"creditAcctBank\": \"VPBANK\",\n" +
                "            \"creditAcctBranch\": \"\",\n" +
                "            \"amountInNumber\": \"\",\n" +
                "            \"amountInWord\": \"\",\n" +
                "            \"transDetails\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"transCode\": \"TT2209209977\",\n" +
                "            \"currency\": \"\",\n" +
                "            \"debitAcctNo\": \"\",\n" +
                "            \"debitAcctName\": \"\",\n" +
                "            \"debitAcctBank\": \"VPBANK\",\n" +
                "            \"debitAcctBranch\": \"\",\n" +
                "            \"creditAcctNo\": \"\",\n" +
                "            \"creditAcctName\": \"\",\n" +
                "            \"creditAcctBank\": \"VPBANK\",\n" +
                "            \"creditAcctBranch\": \"\",\n" +
                "            \"amountInNumber\": \"\",\n" +
                "            \"amountInWord\": \"\",\n" +
                "            \"transDetails\": \"\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
