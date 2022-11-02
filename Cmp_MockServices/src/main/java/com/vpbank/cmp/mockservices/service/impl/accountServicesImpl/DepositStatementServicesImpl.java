package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.accountServices.DepositStatementServices;
import org.springframework.stereotype.Service;

@Service
public class DepositStatementServicesImpl implements DepositStatementServices{
    @Override
    @LogExecutionTime
    public String getDepositStatementServices(String id, String type, String fDate, String toDate){
        return "{\n" +
                "    \"accountList\": [\n" +
                "        {\n" +
                "            \"valDesc\": \"20210303\",\n" +
                "            \"pdesc\": \"AZ Deposit Credit\",\n" +
                "            \"refNo\": \"AZ-235291819\",\n" +
                "            \"bookingDate\": \"2021-03-03\",\n" +
                "            \"pdAmt\": \"0\",\n" +
                "            \"pcAmt\": \"100000000\",\n" +
                "            \"description\": \"Khach hang LE TRIEU KHANG gui tiet kiem/ tien gui CKH\",\n" +
                "            \"dateTime\": \"2103031531\",\n" +
                "            \"acctBalance\": \"100000000\",\n" +
                "            \"balStart\": \"0\",\n" +
                "            \"balEnd\": \"100000000\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
