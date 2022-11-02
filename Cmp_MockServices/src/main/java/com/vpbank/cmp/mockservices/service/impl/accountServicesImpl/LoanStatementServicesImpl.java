package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.accountServices.LoanStatementServices;
import org.springframework.stereotype.Service;

@Service
public class LoanStatementServicesImpl implements LoanStatementServices{
    @Override
    @LogExecutionTime
    public String getLoanStatementServices(String id){
        return "{\n" +
                "  \"transactionList\": [\n" +
                "  {\n" +
                "  \"transactionDate\": \"12/08/2021\",\n" +
                "  \"transactionType\": \"Nhan No\",\n" +
                "  \"disbursementAmount\": \"23123456\",\n" +
                "  \"principleRepayment\": \"\",\n" +
                "  \"overduePrinciple\": \"\",\n" +
                "  \"interestRepayment\": \"\",\n" +
                "  \"overdueInterest\": \"\\n\",\n" +
                "  \"overdueFee\": \"\",\n" +
                "  \"transactionCode\": \"\"\n" +
                "  }\n" +
                "  ]\n" +
                " }";
    }
}
