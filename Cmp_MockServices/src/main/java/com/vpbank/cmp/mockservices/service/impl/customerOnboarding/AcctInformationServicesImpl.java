package com.vpbank.cmp.mockservices.service.impl.customerOnboarding;

import com.vpbank.cmp.mockservices.service.customerOnboardingServices.AcctInformationServices;
import org.springframework.stereotype.Service;


@Service
public class AcctInformationServicesImpl implements AcctInformationServices {
    @Override
    public String getAcctInformationService(String cif, String types) {
        if(types==null){
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
        }else {
            return "{\n" +
                    "    \"products\": {\n" +
                    "        \"customerNumber\": \"76829\",\n" +
                    "        \"accounts\": {\n" +
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
                    "                    \"accuralInterest\": \"0.90\",\n" +
                    "                    \"expectedInterest\": \"0.9\",\n" +
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
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"32015816\",\n" +
                    "                    \"accountCurrency\": \"USD\",\n" +
                    "                    \"availableBalance\": \"2.46\",\n" +
                    "                    \"interestRate\": \"0\",\n" +
                    "                    \"accountTerm\": \"\",\n" +
                    "                    \"openedDate\": \"2011-12-26\",\n" +
                    "                    \"coCode\": \"VN0010106\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2014-01-11\",\n" +
                    "                    \"accuralInterest\": \"0\",\n" +
                    "                    \"expectedInterest\": \"0\",\n" +
                    "                    \"allInOneProduct\": \"6001\",\n" +
                    "                    \"category\": \"6001\",\n" +
                    "                    \"nominatedAccount\": \"\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"\",\n" +
                    "                    \"maturityInstruction\": \"\",\n" +
                    "                    \"introducer\": \"\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"DEMAND SAVINGS ACCOUNTS\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"42015474\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"31339\",\n" +
                    "                    \"interestRate\": \"0.1\",\n" +
                    "                    \"accountTerm\": \"\",\n" +
                    "                    \"openedDate\": \"2012-10-24\",\n" +
                    "                    \"coCode\": \"VN0010118\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2014-01-11\",\n" +
                    "                    \"accuralInterest\": \"1\",\n" +
                    "                    \"expectedInterest\": \"1\",\n" +
                    "                    \"allInOneProduct\": \"6001\",\n" +
                    "                    \"category\": \"6001\",\n" +
                    "                    \"nominatedAccount\": \"\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"\",\n" +
                    "                    \"maturityInstruction\": \"\",\n" +
                    "                    \"introducer\": \"\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"DEMAND SAVINGS ACCOUNTS\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"61656707\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"129627887\",\n" +
                    "                    \"interestRate\": \"5.200000000\",\n" +
                    "                    \"accountTerm\": \"12M\",\n" +
                    "                    \"openedDate\": \"2021-03-17\",\n" +
                    "                    \"coCode\": \"VN0010133\",\n" +
                    "                    \"maturityDate\": \"2022-03-17\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2014-03-17\",\n" +
                    "                    \"accuralInterest\": \"2733195\",\n" +
                    "                    \"expectedInterest\": \"2733195\",\n" +
                    "                    \"allInOneProduct\": \"TD6001\",\n" +
                    "                    \"category\": \"6603\",\n" +
                    "                    \"nominatedAccount\": \"168769\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"159264408\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"1499866326\",\n" +
                    "                    \"interestRate\": \"5.4\",\n" +
                    "                    \"accountTerm\": \"18M\",\n" +
                    "                    \"openedDate\": \"2021-08-03\",\n" +
                    "                    \"coCode\": \"VN0010133\",\n" +
                    "                    \"maturityDate\": \"2023-02-03\",\n" +
                    "                    \"status\": \"BLOCKED\",\n" +
                    "                    \"createDate\": \"2018-08-03\",\n" +
                    "                    \"accuralInterest\": \"1997082\",\n" +
                    "                    \"expectedInterest\": \"1997082\",\n" +
                    "                    \"allInOneProduct\": \"TD1079\",\n" +
                    "                    \"category\": \"6603\",\n" +
                    "                    \"nominatedAccount\": \"168769\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"185230217\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"1624794521\",\n" +
                    "                    \"interestRate\": \"5.300000000\",\n" +
                    "                    \"accountTerm\": \"18M\",\n" +
                    "                    \"openedDate\": \"2020-12-21\",\n" +
                    "                    \"coCode\": \"VN0010214\",\n" +
                    "                    \"maturityDate\": \"2022-06-21\",\n" +
                    "                    \"status\": \"BLOCKED\",\n" +
                    "                    \"createDate\": \"2019-06-20\",\n" +
                    "                    \"accuralInterest\": \"55207402\",\n" +
                    "                    \"expectedInterest\": \"55207402\",\n" +
                    "                    \"allInOneProduct\": \"TD1001\",\n" +
                    "                    \"category\": \"6601\",\n" +
                    "                    \"nominatedAccount\": \"3417751\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"3029\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM SAVING DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"241672166\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"23005468\",\n" +
                    "                    \"interestRate\": \"0.21\",\n" +
                    "                    \"accountTerm\": \"7D\",\n" +
                    "                    \"openedDate\": \"2021-08-09\",\n" +
                    "                    \"coCode\": \"VN0010133\",\n" +
                    "                    \"maturityDate\": \"2021-08-16\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2021-10-22\",\n" +
                    "                    \"accuralInterest\": \"397\",\n" +
                    "                    \"expectedInterest\": \"397\",\n" +
                    "                    \"allInOneProduct\": \"TD6013\",\n" +
                    "                    \"category\": \"6603\",\n" +
                    "                    \"nominatedAccount\": \"168769\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"241674665\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"65015458\",\n" +
                    "                    \"interestRate\": \"0.21\",\n" +
                    "                    \"accountTerm\": \"7D\",\n" +
                    "                    \"openedDate\": \"2021-08-10\",\n" +
                    "                    \"coCode\": \"VN0010133\",\n" +
                    "                    \"maturityDate\": \"2021-08-17\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2021-10-25\",\n" +
                    "                    \"accuralInterest\": \"748\",\n" +
                    "                    \"expectedInterest\": \"748\",\n" +
                    "                    \"allInOneProduct\": \"TD6013\",\n" +
                    "                    \"category\": \"6603\",\n" +
                    "                    \"nominatedAccount\": \"168769\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"241970132\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"10000000\",\n" +
                    "                    \"interestRate\": \"4\",\n" +
                    "                    \"accountTerm\": \"1M\",\n" +
                    "                    \"openedDate\": \"2021-08-06\",\n" +
                    "                    \"coCode\": \"VN0010133\",\n" +
                    "                    \"maturityDate\": \"2021-09-06\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2022-05-16\",\n" +
                    "                    \"accuralInterest\": \"6575\",\n" +
                    "                    \"expectedInterest\": \"6575\",\n" +
                    "                    \"allInOneProduct\": \"TD6001\",\n" +
                    "                    \"category\": \"6603\",\n" +
                    "                    \"nominatedAccount\": \"27892019\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"2916\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"241970148\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"1000000\",\n" +
                    "                    \"interestRate\": \"4\",\n" +
                    "                    \"accountTerm\": \"1M\",\n" +
                    "                    \"openedDate\": \"2021-08-06\",\n" +
                    "                    \"coCode\": \"VN0010133\",\n" +
                    "                    \"maturityDate\": \"2021-09-06\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2022-05-16\",\n" +
                    "                    \"accuralInterest\": \"658\",\n" +
                    "                    \"expectedInterest\": \"658\",\n" +
                    "                    \"allInOneProduct\": \"TD6001\",\n" +
                    "                    \"category\": \"6603\",\n" +
                    "                    \"nominatedAccount\": \"27892019\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"2916\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"241970159\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"1000000\",\n" +
                    "                    \"interestRate\": \"4\",\n" +
                    "                    \"accountTerm\": \"1M\",\n" +
                    "                    \"openedDate\": \"2021-08-06\",\n" +
                    "                    \"coCode\": \"VN0010133\",\n" +
                    "                    \"maturityDate\": \"2021-09-06\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2022-05-16\",\n" +
                    "                    \"accuralInterest\": \"658\",\n" +
                    "                    \"expectedInterest\": \"658\",\n" +
                    "                    \"allInOneProduct\": \"TD6001\",\n" +
                    "                    \"category\": \"6603\",\n" +
                    "                    \"nominatedAccount\": \"27892019\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"2916\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
                    "                },\n" +
                    "                {\n" +
                    "                    \"accountNumber\": \"241970167\",\n" +
                    "                    \"accountCurrency\": \"VND\",\n" +
                    "                    \"availableBalance\": \"1000000\",\n" +
                    "                    \"interestRate\": \"4\",\n" +
                    "                    \"accountTerm\": \"1M\",\n" +
                    "                    \"openedDate\": \"2021-08-06\",\n" +
                    "                    \"coCode\": \"VN0010133\",\n" +
                    "                    \"maturityDate\": \"2021-09-06\",\n" +
                    "                    \"status\": \"CURRENT\",\n" +
                    "                    \"createDate\": \"2022-05-16\",\n" +
                    "                    \"accuralInterest\": \"658\",\n" +
                    "                    \"expectedInterest\": \"658\",\n" +
                    "                    \"allInOneProduct\": \"TD6001\",\n" +
                    "                    \"category\": \"6603\",\n" +
                    "                    \"nominatedAccount\": \"27892019\",\n" +
                    "                    \"i2b\": \"\",\n" +
                    "                    \"dao\": \"2916\",\n" +
                    "                    \"maturityInstruction\": \"AUTOMATIC ROLLOVER\",\n" +
                    "                    \"introducer\": \"76829\",\n" +
                    "                    \"vpbService\": \"\",\n" +
                    "                    \"vpbChannel\": \"\",\n" +
                    "                    \"productCode\": \"AC\",\n" +
                    "                    \"productDesc\": \"TERM DEPOSIT END TERM\",\n" +
                    "                    \"jointHolder\": \"\"\n" +
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
                    "                },\n" +
                    "                {\n" +
                    "                    \"contractNo\": \"LD2108901534\",\n" +
                    "                    \"drawdownAccount\": \"168769\",\n" +
                    "                    \"term\": \"9M\",\n" +
                    "                    \"amount\": \"100000\",\n" +
                    "                    \"valueDate\": \"2021-03-30\",\n" +
                    "                    \"maturityDate\": \"2021-12-30\",\n" +
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
                    "                    \"expectedInterest\": \"3,315\",\n" +
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
                    "                },\n" +
                    "                {\n" +
                    "                    \"contractNo\": \"LD2108901543\",\n" +
                    "                    \"drawdownAccount\": \"168769\",\n" +
                    "                    \"term\": \"12M\",\n" +
                    "                    \"amount\": \"100000\",\n" +
                    "                    \"valueDate\": \"2021-03-30\",\n" +
                    "                    \"maturityDate\": \"2022-03-30\",\n" +
                    "                    \"category\": \"21019\",\n" +
                    "                    \"matInstruction\": \"Automatic Rollover\",\n" +
                    "                    \"interestRate\": \"4.8\",\n" +
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
                    "                    \"expectedInterest\": \"4,800\",\n" +
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

}
