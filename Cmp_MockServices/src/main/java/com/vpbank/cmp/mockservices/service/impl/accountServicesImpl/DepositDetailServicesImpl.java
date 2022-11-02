package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.accountServices.DepositDetailServices;
import org.springframework.stereotype.Service;

@Service
public class DepositDetailServicesImpl implements DepositDetailServices{
    @Override
    @LogExecutionTime
    public String getDepositDetailServices(String id){
        return "{\n" +
                "    \"customerNumber\": \"76829\",\n" +
                "    \"customerName\": \"HAI NGUYEN THI THU GB HAI NGUYEN THI THU VN\",\n" +
                "    \"accountNumber\": \"30222474\",\n" +
                "    \"amount\": \"187.85\",\n" +
                "    \"currentInterestAmount\": \"0.87\",\n" +
                "    \"term\": \"12M\",\n" +
                "    \"interestRate\": \"0.6\",\n" +
                "    \"origInterestRate\": \"2\",\n" +
                "    \"openedDate\": \"2020-10-26\",\n" +
                "    \"maturityDate\": \"2021-10-26\",\n" +
                "    \"currency\": \"AUD\",\n" +
                "    \"category\": \"6601\",\n" +
                "    \"repayAccount\": \"AUD1000118120273\",\n" +
                "    \"nominatedAccount\": \"30222849\",\n" +
                "    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                "    \"rolloverTerm\": \"0012M\",\n" +
                "    \"rolloverIntRate\": \"P02\",\n" +
                "    \"coCode\": \"VN0010273\",\n" +
                "    \"createDate\": \"2011-10-26\",\n" +
                "    \"schedules\": \"N\",\n" +
                "    \"allInOneProduct\": \"TD1019\",\n" +
                "    \"azaltAcctId\": \"AL0198237\",\n" +
                "    \"departmentCode\": \"9912\",\n" +
                "    \"branchName\": \"VPBANK BINH PHU\",\n" +
                "    \"accountType\": \"AC\",\n" +
                "    \"payIntAtMat\": \"NO\"\n" +
                "}";
    }
}
