package com.vpbank.cmp.mockservices.service.impl;

import com.vpbank.cmp.mockservices.service.AcctInformationServices;
import org.springframework.stereotype.Service;


@Service
public class AcctInformationServicesImpl implements AcctInformationServices {
    @Override
    public String getAcctInformationService(String cif) {
        return "{\n" +
                "    \"products\": {\n" +
                "        \"customerNumber\": \"76829\",\n" +
                "        \"accounts\": {\n" +
                "            \"ca\": [\n" +
                "                {\n" +
                "                    \"accountNumber\": \"168769\",\n" +
                "                    \"accountCurrency\": \"VND\",\n" +
                "                    \"accountCategory\": \"1001\",\n" +
                "                    \"postingRestrict\": \"\",\n" +
                "                    \"postingRestrictDescription\": \"\",\n" +
                "                    \"accountName\": \"HAI NGUYEN THI THU GB\",\n" +
                "                    \"coCode\": \"VN0010133\",\n" +
                "                    \"balanceInfo\": {\n" +
                "                        \"workingBalance\": \"11720477321\",\n" +
                "                        \"availableBalance\": \"11720477321\",\n" +
                "                        \"lockedAmount\": \"0\",\n" +
                "                        \"limitAmount\": \"0\"\n" +
                "                    },\n" +
                "                    \"DAO\": \"\",\n" +
                "                    \"VPBAcStatus\": \"ACTIVE\",\n" +
                "                    \"branchStatus\": \"OPEN\",\n" +
                "                    \"openedDate\": \"2006-10-02\",\n" +
                "                    \"customerType\": \"12\",\n" +
                "                    \"overdraftType\": \"\",\n" +
                "                    \"vpbService\": \"Payroll\",\n" +
                "                    \"serviceChannel\": \"\",\n" +
                "                    \"categoryName\": \"DEMAND DEPOSIT\",\n" +
                "                    \"jointHolder\": \"NO\",\n" +
                "                    \"productCode\": \"AC\",\n" +
                "                    \"linkAccountNo\": \"\",\n" +
                "                    \"payrollType\": \"\",\n" +
                "                    \"limitRef\": \"\",\n" +
                "                    \"interestRate\": \"\",\n" +
                "                    \"nickName\": \"\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"sa\": [\n" +
                "                {\n" +
                "                    \"accountNumber\": \"30222474\",\n" +
                "                    \"accountCurrency\": \"AUD\",\n" +
                "                    \"availableBalance\": \"187.85\",\n" +
                "                    \"interestRate\": \"0.6\",\n" +
                "                    \"accountTerm\": \"12M\",\n" +
                "                    \"openedDate\": \"2020-10-26\",\n" +
                "                    \"coCode\": \"VN0010273\",\n" +
                "                    \"maturityDate\": \"2021-10-26\",\n" +
                "                    \"status\": \"CURRENT\",\n" +
                "                    \"createDate\": \"2011-10-26\",\n" +
                "                    \"accuralInterest\": \"0.87\",\n" +
                "                    \"expectedInterest\": \"0.87\",\n" +
                "                    \"allInOneProduct\": \"TD1019\",\n" +
                "                    \"category\": \"6601\",\n" +
                "                    \"nominatedAccount\": \"30222849\",\n" +
                "                    \"i2b\": \"\",\n" +
                "                    \"dao\": \"3610\",\n" +
                "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                "                    \"introducer\": \"76829\",\n" +
                "                    \"vpbService\": \"\",\n" +
                "                    \"vpbChannel\": \"\",\n" +
                "                    \"productCode\": \"AC\",\n" +
                "                    \"productDesc\": \"TERM SAVING DEPOSIT END TERM\",\n" +
                "                    \"jointHolder\": \"\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"loan\": [\n" +
                "                {\n" +
                "                    \"contractNumber\": \"LD1435100217\",\n" +
                "                    \"accountCurrency\": \"VND\",\n" +
                "                    \"productName\": \"LDS14001\",\n" +
                "                    \"term\": \"180M\",\n" +
                "                    \"interestRate\": \"0.8\",\n" +
                "                    \"lendingAmount\": \"2000000000\",\n" +
                "                    \"currentOutstanding\": \"1168900000\",\n" +
                "                    \"dateInterestChange\": \"2021-04-01\",\n" +
                "                    \"lendingDate\": \"2014-12-17\",\n" +
                "                    \"coCode\": \"VN0010214\",\n" +
                "                    \"maturityDate\": \"2029-12-17\",\n" +
                "                    \"status\": \"CUR\",\n" +
                "                    \"legacyRef\": \"LD1435100217\",\n" +
                "                    \"rrtLD\": \"1\",\n" +
                "                    \"loanType\": \"SL\",\n" +
                "                    \"approvedAmount\": \"2000000000\",\n" +
                "                    \"i2b\": \"N\",\n" +
                "                    \"productCode\": \"LD\",\n" +
                "                    \"productDesc\": \"Cho vay tieu dung\",\n" +
                "                    \"category\": \"21055\",\n" +
                "                    \"productProgram\": \"\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"contractNumber\": \"LD1435200022\",\n" +
                "                    \"accountCurrency\": \"VND\",\n" +
                "                    \"productName\": \"LDS14001\",\n" +
                "                    \"term\": \"180M\",\n" +
                "                    \"interestRate\": \"0.8\",\n" +
                "                    \"lendingAmount\": \"2000000000\",\n" +
                "                    \"currentOutstanding\": \"1168900000\",\n" +
                "                    \"dateInterestChange\": \"2021-04-01\",\n" +
                "                    \"lendingDate\": \"2014-12-18\",\n" +
                "                    \"coCode\": \"VN0010214\",\n" +
                "                    \"maturityDate\": \"2029-12-18\",\n" +
                "                    \"status\": \"CUR\",\n" +
                "                    \"legacyRef\": \"LD14352/00022\",\n" +
                "                    \"rrtLD\": \"1\",\n" +
                "                    \"loanType\": \"SL\",\n" +
                "                    \"approvedAmount\": \"2000000000\",\n" +
                "                    \"i2b\": \"N\",\n" +
                "                    \"productCode\": \"LD\",\n" +
                "                    \"productDesc\": \"Cho vay tieu dung\",\n" +
                "                    \"category\": \"21055\",\n" +
                "                    \"productProgram\": \"\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"esa\": [\n" +
                "                {\n" +
                "                    \"contractNo\": \"LD2103000065\",\n" +
                "                    \"drawdownAccount\": \"168769\",\n" +
                "                    \"term\": \"9M\",\n" +
                "                    \"amount\": \"100000\",\n" +
                "                    \"valueDate\": \"2021-01-30\",\n" +
                "                    \"maturityDate\": \"2021-10-30\",\n" +
                "                    \"category\": \"21019\",\n" +
                "                    \"matInstruction\": \"Automatic Rollover\",\n" +
                "                    \"interestRate\": \"4.4\",\n" +
                "                    \"currency\": \"VND\",\n" +
                "                    \"frqDeposit\": \"\",\n" +
                "                    \"prinLiqAcct\": \"168769\",\n" +
                "                    \"intLiqAcct\": \"168769\",\n" +
                "                    \"contactList\": [\n" +
                "                        {\n" +
                "                            \"contactType\": \"Mobile\",\n" +
                "                            \"contactInfo\": \"0000\"\n" +
                "                        }\n" +
                "                    ],\n" +
                "                    \"accuralInterest\": \"\",\n" +
                "                    \"expectedInterest\": \"3,291\",\n" +
                "                    \"coCode\": \"VN0010133\",\n" +
                "                    \"status\": \"CURRENT\",\n" +
                "                    \"i2b\": \"Y\",\n" +
                "                    \"dao\": \"5\",\n" +
                "                    \"vpbService\": \"\",\n" +
                "                    \"vpbChannel\": \"\",\n" +
                "                    \"introducer\": \"\",\n" +
                "                    \"productCode\": \"LD\",\n" +
                "                    \"productDesc\": \"TIEN GUI CO KY HAN GUI GOP\",\n" +
                "                    \"productProgram\": \"\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";
    }

}
