package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.InternalTransactionInfoServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class InternalTransactionInfoServicesImpl implements InternalTransactionInfoServices {
    @Override
    public String getInternalTransactionInfoServices(String id) {
        return "{\n" +
                "    \"customerNumber\": \"76829\",\n" +
                "    \"accountDetails\": {\n" +
                "        \"accountNumber\": \"168769\",\n" +
                "        \"currency\": \"VND\",\n" +
                "        \"category\": \"1001\",\n" +
                "        \"categoryName\": \"DEM DEPO\",\n" +
                "        \"accountOfficer\": \"133\",\n" +
                "        \"accountStatus\": \"ACTIVE\",\n" +
                "        \"accountStatusDate\": \"2021-08-05\",\n" +
                "        \"bonusType\": \"\",\n" +
                "        \"jointHolder\": \"\",\n" +
                "        \"accountType\": \"AC\",\n" +
                "        \"accountName\": \"HAI NGUYEN THI THU GB.1\",\n" +
                "        \"branchName\": \"SO GIAO DICH\",\n" +
                "        \"branchCode\": \"VN0010133\",\n" +
                "        \"workingBalance\": \"11720450702\",\n" +
                "        \"availableBalance\": \"11720450702\",\n" +
                "        \"openActualBalance\": \"11720450702\",\n" +
                "        \"averageBalancePerMonth\": \"11720507528\",\n" +
                "        \"lockedAmount\": \"0\",\n" +
                "        \"relationCode\": \"\",\n" +
                "        \"relationNote\": \"\",\n" +
                "        \"payrollType\": \"\",\n" +
                "        \"payrollDate\": \"\",\n" +
                "        \"alternateID1\": \"B2K1383740\",\n" +
                "        \"alternateID4\": \"\",\n" +
                "        \"currNumber\": \"18\",\n" +
                "        \"inputter\": \"DIUPT03\",\n" +
                "        \"dateTime\": \"2022-03-09T15:24:27.901228+07:00\",\n" +
                "        \"authoriser\": \"DIUPT03\",\n" +
                "        \"vpbLnkPartner\": \"\",\n" +
                "        \"departmentCode\": \"17\",\n" +
                "        \"overrides\": \"\",\n" +
                "        \"postingRestrict\": \"\",\n" +
                "        \"postingRestrictDes\": \"\",\n" +
                "        \"dao\": \"\",\n" +
                "        \"branchStatus\": \"OPEN\",\n" +
                "        \"channelCredit\": \"\",\n" +
                "        \"inputChannel\": \"\",\n" +
                "        \"authorChannel\": \"\",\n" +
                "        \"custType\": \"12\",\n" +
                "        \"relatedAccount\": \"\",\n" +
                "        \"accountToCredit\": \"\",\n" +
                "        \"overdraftType\": \"\",\n" +
                "        \"limitExpireDate\": \"\",\n" +
                "        \"vpbService\": \"Payroll\",\n" +
                "        \"serviceChannel\": \"\",\n" +
                "        \"odInterestRate\": \"\",\n" +
                "        \"vitualAltAcccount\": \"\",\n" +
                "        \"vanAmountConditional\": \"\",\n" +
                "        \"nickName\": \"\",\n" +
                "        \"vanMaster\": \"\",\n" +
                "        \"limStartDate\": \"\",\n" +
                "        \"openDate\": \"2006-10-02\",\n" +
                "        \"limitAmount\": \"\",\n" +
                "        \"currNoChannel\": \"\",\n" +
                "        \"regDateTime\": \"\",\n" +
                "        \"onlineActualBalance\": \"11720450702\",\n" +
                "        \"vanBatchMaster\": \"\"\n" +
                "    }\n" +
                "}";
    }

}
