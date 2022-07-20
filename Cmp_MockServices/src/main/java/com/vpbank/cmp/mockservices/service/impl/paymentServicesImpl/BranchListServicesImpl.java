package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.BranchListServices;
import org.springframework.stereotype.Service;


@Service
public class BranchListServicesImpl implements BranchListServices {
    @Override
    public String getBranchListServices(String id) {
        return "{\n" +
                "    \"id\": 65,\n" +
                "    \"bankName\": \"NH Nha Nuoc\",\n" +
                "    \"shortName\": \"NHNN\",\n" +
                "    \"altName\": \"\",\n" +
                "    \"bin\": \"\",\n" +
                "    \"active\": true,\n" +
                "    \"cities\": [\n" +
                "        {\n" +
                "            \"id\": 18,\n" +
                "            \"name\": \"Bac Giang\",\n" +
                "            \"simplifyName\": \"Bac Giang\",\n" +
                "            \"citadCode\": 24,\n" +
                "            \"branchCorporates\": [\n" +
                "                {\n" +
                "                    \"id\": 18,\n" +
                "                    \"name\": \"BAC GIANG\",\n" +
                "                    \"code\": \"124101001\",\n" +
                "                    \"channel\": \"citad\",\n" +
                "                    \"active\": true,\n" +
                "                    \"isDefault\": false,\n" +
                "                    \"citadCode\": \"124101001\",\n" +
                "                    \"bidvCode\": \"\",\n" +
                "                    \"vcbCode\": \"2\",\n" +
                "                    \"citadCurrency\": \"VND\",\n" +
                "                    \"bidvCurrency\": \"\",\n" +
                "                    \"vcbCurrency\": \"VND,EUR,GBP,USD,CHF,JPY,AUD,CAD,SGD,DKK,SEK\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 10,\n" +
                "            \"name\": \"Lang Son\",\n" +
                "            \"simplifyName\": \"Lang Son\",\n" +
                "            \"citadCode\": 20,\n" +
                "            \"branchCorporates\": [\n" +
                "                {\n" +
                "                    \"id\": 16,\n" +
                "                    \"name\": \"LANG SON\",\n" +
                "                    \"code\": \"120101001\",\n" +
                "                    \"channel\": \"citad\",\n" +
                "                    \"active\": true,\n" +
                "                    \"isDefault\": false,\n" +
                "                    \"citadCode\": \"120101001\",\n" +
                "                    \"bidvCode\": \"\",\n" +
                "                    \"vcbCode\": \"2\",\n" +
                "                    \"citadCurrency\": \"VND\",\n" +
                "                    \"bidvCurrency\": \"\",\n" +
                "                    \"vcbCurrency\": \"VND,EUR,GBP,USD,CHF,JPY,AUD,CAD,SGD,DKK,SEK\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"Ha Noi\",\n" +
                "            \"simplifyName\": \"Ha Noi\",\n" +
                "            \"citadCode\": 1,\n" +
                "            \"branchCorporates\": [\n" +
                "                {\n" +
                "                    \"id\": 1,\n" +
                "                    \"name\": \"HA NOI\",\n" +
                "                    \"code\": \"101101100\",\n" +
                "                    \"channel\": \"citad\",\n" +
                "                    \"active\": true,\n" +
                "                    \"isDefault\": false,\n" +
                "                    \"citadCode\": \"101101100\",\n" +
                "                    \"bidvCode\": \"\",\n" +
                "                    \"vcbCode\": \"2\",\n" +
                "                    \"citadCurrency\": \"VND\",\n" +
                "                    \"bidvCurrency\": \"\",\n" +
                "                    \"vcbCurrency\": \"VND,EUR,GBP,USD,CHF,JPY,AUD,CAD,SGD,DKK,SEK\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 2,\n" +
                "                    \"name\": \"VU TAI CHINH KE TOAN\",\n" +
                "                    \"code\": \"101101011\",\n" +
                "                    \"channel\": \"citad\",\n" +
                "                    \"active\": true,\n" +
                "                    \"isDefault\": false,\n" +
                "                    \"citadCode\": \"101101011\",\n" +
                "                    \"bidvCode\": \"\",\n" +
                "                    \"vcbCode\": \"2\",\n" +
                "                    \"citadCurrency\": \"VND\",\n" +
                "                    \"bidvCurrency\": \"\",\n" +
                "                    \"vcbCurrency\": \"VND,EUR,GBP,USD,CHF,JPY,AUD,CAD,SGD,DKK,SEK\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 3,\n" +
                "                    \"name\": \"SO GIAO DICH\",\n" +
                "                    \"code\": \"101101014\",\n" +
                "                    \"channel\": \"citad\",\n" +
                "                    \"active\": true,\n" +
                "                    \"isDefault\": false,\n" +
                "                    \"citadCode\": \"101101014\",\n" +
                "                    \"bidvCode\": \"\",\n" +
                "                    \"vcbCode\": \"2\",\n" +
                "                    \"citadCurrency\": \"VND,USD\",\n" +
                "                    \"bidvCurrency\": \"\",\n" +
                "                    \"vcbCurrency\": \"VND,EUR,GBP,USD,CHF,JPY,AUD,CAD,SGD,DKK,SEK\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"id\": 4,\n" +
                "                    \"name\": \"CUC QUAN TRI\",\n" +
                "                    \"code\": \"101101018\",\n" +
                "                    \"channel\": \"citad\",\n" +
                "                    \"active\": true,\n" +
                "                    \"isDefault\": false,\n" +
                "                    \"citadCode\": \"101101018\",\n" +
                "                    \"bidvCode\": \"\",\n" +
                "                    \"vcbCode\": \"2\",\n" +
                "                    \"citadCurrency\": \"VND\",\n" +
                "                    \"bidvCurrency\": \"\",\n" +
                "                    \"vcbCurrency\": \"VND,EUR,GBP,USD,CHF,JPY,AUD,CAD,SGD,DKK,SEK\"\n" +
                "                }\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"napasCard\": false,\n" +
                "    \"napasAccount\": false\n" +
                "}";
    }

}
