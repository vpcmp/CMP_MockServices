package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.service.paymentServices.TransactionInfoServices;
import org.springframework.stereotype.Service;


@Service
public class TransactionInfoServicesImpl implements TransactionInfoServices {
    @Override
    public String getTransactionInfoServices(String debAcc, String refNo) {
        return "{\n" +
                "    \"transfers\": [\n" +
                "        {\n" +
                "            \"branchNo\": \"VN0010001\",\n" +
                "            \"txnId\": \"FT21201206094895\",\n" +
                "            \"status\": \"AUTH\",\n" +
                "            \"remark\": \"In phieu cungp ag44444gg32131231231 313123434 34324242 323123123 213123 32432424234 2314324234324242342342 34432121213131\",\n" +
                "            \"inputter\": \"EBANK.4\",\n" +
                "            \"debit\": {\n" +
                "                \"account\": \"4668883333\",\n" +
                "                \"amount\": \"5000\",\n" +
                "                \"currency\": \"VND\"\n" +
                "            },\n" +
                "            \"credit\": {\n" +
                "                \"account\": \"232506601\",\n" +
                "                \"amount\": \"0\",\n" +
                "                \"currency\": \"VND\"\n" +
                "            },\n" +
                "            \"charge\": {\n" +
                "                \"amount\": \"0\"\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

}
