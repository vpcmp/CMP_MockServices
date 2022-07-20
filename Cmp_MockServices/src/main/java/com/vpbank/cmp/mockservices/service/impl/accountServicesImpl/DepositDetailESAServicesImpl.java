package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.service.accountServices.DepositDetailESAServices;
import org.springframework.stereotype.Service;

@Service
public class DepositDetailESAServicesImpl implements DepositDetailESAServices{
    @Override
    public String getDepositDetailESAServices(String id){
        return "{\n" +
                "    \"customerNumber\": \"76829\",\n" +
                "    \"customerName\": \"HAI NGUYEN THI THU GB HAI NGUYEN THI THU VN\",\n" +
                "    \"contractNo\": \"LD2103000065\",\n" +
                "    \"category\": \"21019\",\n" +
                "    \"principalAmount\": \"100000\",\n" +
                "    \"currentInterestAmount\": \"2256\",\n" +
                "    \"currentInterestRate\": \"4.4\",\n" +
                "    \"term\": \"9M\",\n" +
                "    \"valueDate\": \"2021-01-30\",\n" +
                "    \"maturityDate\": \"2021-10-30\",\n" +
                "    \"currency\": \"VND\",\n" +
                "    \"drawdownAccount\": \"168769\",\n" +
                "    \"prinLiqAccount\": \"168769\",\n" +
                "    \"intLiqAccount\": \"168769\",\n" +
                "    \"maturityInstruction\": \"Automatic Rollover\",\n" +
                "    \"dao\": \"VN0010001\",\n" +
                "    \"createDate\": \"2021-01-30T07:12:58.513359+07:00\",\n" +
                "    \"coCode\": \"VN0010133\",\n" +
                "    \"branchName\": \"SO GIAO DICH\",\n" +
                "    \"accountType\": \"LD\"\n" +
                "}";
    }
}
