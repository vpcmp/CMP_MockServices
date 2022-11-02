package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.accountServices.LoanSummaryServices;
import org.springframework.stereotype.Service;

@Service
public class LoanSummaryServicesImpl implements LoanSummaryServices {
    @Override
    @LogExecutionTime
    public String getLoanSummaryServices(String cif) {
        return "{\n" +
                "    \"loanList\": [\n" +
                "        {\n" +
                "            \"contractNumber\": \"LD1435100217\",\n" +
                "            \"accountCurrency\": \"VND\",\n" +
                "            \"lendingAmount\": \"2000000000\",\n" +
                "            \"currentOutstanding\": \"1168900000\",\n" +
                "            \"lendingDate\": \"2014-12-17\",\n" +
                "            \"coCode\": \"VN0010214\",\n" +
                "            \"maturityDate\": \"2029-12-17\",\n" +
                "            \"status\": \"CUR\",\n" +
                "            \"rrtLD\": \"1\",\n" +
                "            \"legacyRef\": \"LD1435100217\",\n" +
                "            \"term\": \"180M\",\n" +
                "            \"interestRate\": \"0.8\",\n" +
                "            \"dateInterestChange\": \"2021-04-01\",\n" +
                "            \"productName\": \"LDS14001\",\n" +
                "            \"loanType\": \"SL\",\n" +
                "            \"approvedAmount\": \"2000000000\",\n" +
                "            \"contractType\": \"AMORT\",\n" +
                "            \"branchName\": \"VPBANK THANH CONG\",\n" +
                "            \"thisPeriodInterestAmount\": \"778782\",\n" +
                "            \"nextPayPrincipleDate\": \"2021-08-30\",\n" +
                "            \"thisPeriodPrincipleAmount\": \"10900000\",\n" +
                "            \"nextPayInterestDate\": \"2021-09-01\",\n" +
                "            \"preferentialLoanProgram\": \"02\",\n" +
                "            \"bookType\": \"VN0010214\",\n" +
                "            \"channel\": \"N\",\n" +
                "            \"productCode\": \"LD\",\n" +
                "            \"productDesc\": \"Cho vay tieu dung\",\n" +
                "            \"category\": \"21055\",\n" +
                "            \"repayPDate\": \"30\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"contractNumber\": \"LD1435200022\",\n" +
                "            \"accountCurrency\": \"VND\",\n" +
                "            \"lendingAmount\": \"2000000000\",\n" +
                "            \"currentOutstanding\": \"1168900000\",\n" +
                "            \"lendingDate\": \"2014-12-18\",\n" +
                "            \"coCode\": \"VN0010214\",\n" +
                "            \"maturityDate\": \"2029-12-18\",\n" +
                "            \"status\": \"CUR\",\n" +
                "            \"rrtLD\": \"1\",\n" +
                "            \"legacyRef\": \"LD14352/00022\",\n" +
                "            \"term\": \"180M\",\n" +
                "            \"interestRate\": \"0.8\",\n" +
                "            \"dateInterestChange\": \"2021-04-01\",\n" +
                "            \"productName\": \"LDS14001\",\n" +
                "            \"loanType\": \"SL\",\n" +
                "            \"approvedAmount\": \"2000000000\",\n" +
                "            \"contractType\": \"AMORT\",\n" +
                "            \"branchName\": \"VPBANK THANH CONG\",\n" +
                "            \"thisPeriodInterestAmount\": \"778782\",\n" +
                "            \"nextPayPrincipleDate\": \"2021-08-30\",\n" +
                "            \"thisPeriodPrincipleAmount\": \"10900000\",\n" +
                "            \"nextPayInterestDate\": \"2021-09-01\",\n" +
                "            \"preferentialLoanProgram\": \"02\",\n" +
                "            \"bookType\": \"VN0010214\",\n" +
                "            \"channel\": \"N\",\n" +
                "            \"productCode\": \"LD\",\n" +
                "            \"productDesc\": \"Cho vay tieu dung\",\n" +
                "            \"category\": \"21055\",\n" +
                "            \"repayPDate\": \"30\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
