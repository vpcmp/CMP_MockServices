package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.paymentServices.BankListServices;
import org.springframework.stereotype.Service;


@Service
public class BankListServicesImpl implements BankListServices {
    @Override
    @LogExecutionTime
    public String getBankListServices() {
        return "{\n" +
                "    \"bankList\": [\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"bankName\": \"NH An Binh\",\n" +
                "            \"shortName\": \"ABBANK\",\n" +
                "            \"bin\": \"970425\",\n" +
                "            \"napasCard\": true,\n" +
                "            \"napasAccount\": true\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"bankName\": \"NH NONG NGHIEP TRUNG QUOC (AGRI BANK OF CHINA)\",\n" +
                "            \"shortName\": \"ABC\",\n" +
                "            \"bin\": \"\",\n" +
                "            \"napasCard\": false,\n" +
                "            \"napasAccount\": false\n" +
                "        },\n" +
                "                {\n" +
                "            \"id\": 101,\n" +
                "            \"bankName\": \"Woori Bank\",\n" +
                "            \"shortName\": \"WOORI BANK\",\n" +
                "            \"bin\": \"970457\",\n" +
                "            \"napasCard\": true,\n" +
                "            \"napasAccount\": true\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

}
