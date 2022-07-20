package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;


import com.vpbank.cmp.mockservices.service.accountServices.AcctSummaryServices;
import org.springframework.stereotype.Service;


@Service
public class AcctSummaryServicesImpl implements AcctSummaryServices {
    @Override
    public String getAcctSummaryServices(String cif) {
                return "{\n" +
                "    \"customerNumber\": \"76829\",\n" +
                "    \"accountList\": [\n" +
                "        {\n" +
                "            \"accountNumber\": \"168769\",\n" +
                "            \"currency\": \"VND\",\n" +
                "            \"category\": \"1001\",\n" +
                "            \"postingRestrict\": \"\",\n" +
                "            \"postingRestrictDescription\": \"\",\n" +
                "            \"accountName\": \"HAI NGUYEN THI THU GB\",\n" +
                "            \"coCode\": \"VN0010133\",\n" +
                "            \"jointHolder\": \"NO\",\n" +
                "            \"dao\": \"\",\n" +
                "            \"VPBAcStatus\": \"ACTIVE\",\n" +
                "            \"VPBAcSTTDate\": \"2021-08-05\",\n" +
                "            \"branchStatus\": \"OPEN\",\n" +
                "            \"openedDate\": \"2006-10-02\",\n" +
                "            \"customerType\": \"12\",\n" +
                "            \"overdraftType\": \"\",\n" +
                "            \"categoryName\": \"DEMAND DEPOSIT\",\n" +
                "            \"vpbService\": \"Payroll\",\n" +
                "            \"serviceChannel\": \"\",\n" +
                "            \"daoPb\": \"\",\n" +
                "            \"productCode\": \"AC\",\n" +
                "            \"linkAccountNo\": \"\",\n" +
                "            \"payrollType\": \"\",\n" +
                "            \"payrollDate\": \"\",\n" +
                "            \"limitRef\": \"\",\n" +
                "            \"accountShortName\": \"HAI NGUYEN THI THU GB.1\",\n" +
                "            \"repayLDAccount\": \"Y\",\n" +
                "            \"balanceInfo\": {\n" +
                "                \"workingBalance\": \"11720450702\",\n" +
                "                \"availableBalance\": \"11720450702\",\n" +
                "                \"lockedAmount\": \"0\",\n" +
                "                \"limitAmount\": \"0\",\n" +
                "                \"onlineActualBal\": \"11720450702\"\n" +
                "            },\n" +
                "            \"interestRate\": \"\",\n" +
                "            \"nickName\": \"\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"accountNumber\": \"0973854527\",\n" +
                "            \"currency\": \"VND\",\n" +
                "            \"category\": \"1001\",\n" +
                "            \"postingRestrict\": \"\",\n" +
                "            \"postingRestrictDescription\": \"\",\n" +
                "            \"accountName\": \"HAI NGUYEN THI THU VN HAI NGUYEN TH I THU VN 2\",\n" +
                "            \"coCode\": \"VN0010280\",\n" +
                "            \"jointHolder\": \"NO\",\n" +
                "            \"dao\": \"19655\",\n" +
                "            \"VPBAcStatus\": \"ACTIVE\",\n" +
                "            \"VPBAcSTTDate\": \"2021-08-05\",\n" +
                "            \"branchStatus\": \"OPEN\",\n" +
                "            \"openedDate\": \"2021-07-26\",\n" +
                "            \"customerType\": \"\",\n" +
                "            \"overdraftType\": \"\",\n" +
                "            \"categoryName\": \"DEMAND DEPOSIT\",\n" +
                "            \"vpbService\": \"DIGITALSODEP\",\n" +
                "            \"serviceChannel\": \"VPO\",\n" +
                "            \"daoPb\": \"\",\n" +
                "            \"productCode\": \"AC\",\n" +
                "            \"linkAccountNo\": \"\",\n" +
                "            \"payrollType\": \"\",\n" +
                "            \"payrollDate\": \"\",\n" +
                "            \"limitRef\": \"\",\n" +
                "            \"accountShortName\": \"HAI NGUYEN THI THU VN 2\",\n" +
                "            \"repayLDAccount\": \"N\",\n" +
                "            \"balanceInfo\": {\n" +
                "                \"workingBalance\": \"0\",\n" +
                "                \"availableBalance\": \"0\",\n" +
                "                \"lockedAmount\": \"0\",\n" +
                "                \"limitAmount\": \"0\",\n" +
                "                \"onlineActualBal\": \"0\"\n" +
                "            },\n" +
                "            \"interestRate\": \"\",\n" +
                "            \"nickName\": \"\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

}
