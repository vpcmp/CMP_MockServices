package com.vpbank.cmp.mockservices.service.impl;

import com.vpbank.cmp.mockservices.service.AcctDetailServices;
import org.springframework.stereotype.Service;


@Service
public class AcctDetailServicesImpl implements AcctDetailServices {
    @Override
    public String getAcctDetailServices(String cif) {
        return "{\n" +
                "    \"customerNumber\": \"6605786\",\n" +
                "    \"accountDetails\": {\n" +
                "        \"accountNumber\": \"230095639\",\n" +
                "        \"currency\": \"VND\",\n" +
                "        \"category\": \"1001\",\n" +
                "        \"categoryName\": \"DEM DEPO\",\n" +
                "        \"accountOfficer\": \"356\",\n" +
                "        \"accountStatus\": \"ACTIVE\",\n" +
                "        \"accountStatusDate\": \"\",\n" +
                "        \"bonusType\": \"\",\n" +
                "        \"jointHolder\": \"\",\n" +
                "        \"accountType\": \"AC\",\n" +
                "        \"accountName\": \"VPBANK-230095639 CATEG1001\",\n" +
                "        \"branchName\": \"VPBANK DAK LAK\",\n" +
                "        \"branchCode\": \"VN0010356\",\n" +
                "        \"workingBalance\": \"9997519028\",\n" +
                "        \"availableBalance\": \"9997519028\",\n" +
                "        \"openActualBalance\": \"9997819028\",\n" +
                "        \"averageBalancePerMonth\": \"9030028705\",\n" +
                "        \"lockedAmount\": \"0\",\n" +
                "        \"relationCode\": \"\",\n" +
                "        \"relationNote\": \"\",\n" +
                "        \"payrollType\": \"\",\n" +
                "        \"payrollDate\": \"\",\n" +
                "        \"alternateID1\": \"\",\n" +
                "        \"alternateID4\": \"\",\n" +
                "        \"currNumber\": \"4\",\n" +
                "        \"inputter\": \"HUYENDTT20\",\n" +
                "        \"dateTime\": \"2022-04-26T16:57:56.885288+07:00\",\n" +
                "        \"authoriser\": \"HUYENDTT20\",\n" +
                "        \"vpbLnkPartner\": \"1-NONE\",\n" +
                "        \"departmentCode\": \"17\",\n" +
                "        \"overrides\": \"\",\n" +
                "        \"postingRestrict\": \"\",\n" +
                "        \"postingRestrictDes\": \"\",\n" +
                "        \"dao\": \"24818\",\n" +
                "        \"branchStatus\": \"OPEN\",\n" +
                "        \"channelCredit\": \"\",\n" +
                "        \"inputChannel\": \"\",\n" +
                "        \"authorChannel\": \"\",\n" +
                "        \"custType\": \"144\",\n" +
                "        \"relatedAccount\": \"\",\n" +
                "        \"accountToCredit\": \"\",\n" +
                "        \"overdraftType\": \"\",\n" +
                "        \"limitExpireDate\": \"\",\n" +
                "        \"vpbService\": \"\",\n" +
                "        \"serviceChannel\": \"\",\n" +
                "        \"odInterestRate\": \"\",\n" +
                "        \"vitualAltAcccount\": \"\",\n" +
                "        \"vanAmountConditional\": \"\",\n" +
                "        \"nickName\": \"\",\n" +
                "        \"vanMaster\": \"\",\n" +
                "        \"limStartDate\": \"\",\n" +
                "        \"openDate\": \"2020-12-15\",\n" +
                "        \"limitAmount\": \"\",\n" +
                "        \"currNoChannel\": \"\",\n" +
                "        \"regDateTime\": \"\",\n" +
                "        \"onlineActualBalance\": \"9997519028\",\n" +
                "        \"vanBatchMaster\": \"\"\n" +
                "    }\n" +
                "}";
    }

}
