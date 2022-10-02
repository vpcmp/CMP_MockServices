
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.vpbank.cmp.mockservices.service.vituralAccountServices.StatementAccountServices;
import org.springframework.stereotype.Service;


@Service
public class StatementAccountServicesImpl implements StatementAccountServices {
    @Override
    public String statementAccountServices() {
        return "{\n" +
                "    \"context\": {\n" +
                "        \"interfaceId\": \"QVASTMTINQUIRY_E_VIEW\",\n" +
                "        \"channelId\": \"API\",\n" +
                "        \"bankEntityId\": \"IGTBVN\",\n" +
                "        \"status\": \"Success\",\n" +
                "        \"error\": \"0\",\n" +
                "        \"message\": \"Success\",\n" +
                "        \"xrequestId\": \"H2H98743010\",\n" +
                "        \"x_request_id\": \"H2H98743010\"\n" +
                "    },\n" +
                "    \"payload\": {\n" +
                "        \"qvastmtInquiryDetails\": [\n" +
                "            {\n" +
                "                \"channelId\": \"BM\",\n" +
                "                \"virtualAccountNumber\": \"AG5555501\",\n" +
                "                \"virtualAccountName\": \"\",\n" +
                "                \"vaType\": \"Customer Virtual Account Number\",\n" +
                "                \"rootVa\": \"AG55555\",\n" +
                "                \"transactionDate\": \"01-JUL-2022\",\n" +
                "                \"valueDateTime\": \"30-JUN-2022 23:11:12\",\n" +
                "                \"transactionCode\": \"TXN012\",\n" +
                "                \"transactionDescription\": \"\",\n" +
                "                \"narration\": \" CLEARING BULK CHQ DEPOSIT: REF_101XXXXXXXX01 \",\n" +
                "                \"status\": \"PENDING\",\n" +
                "                \"currency\": \"VND\",\n" +
                "                \"creditAmount\": \"\",\n" +
                "                \"debitAmount\": \"25,125.00\",\n" +
                "                \"runningBalance\": \"-25,125.00\",\n" +
                "                \"creditReferenceNumber\": \"VAM221990000001770\",\n" +
                "                \"paymentMode\": null,\n" +
                "                \"debitReferenceNumber\": \"EN520004\",\n" +
                "                \"xrequestId\": \"BM0000823\",\n" +
                "                \"x_request_id\": \"BM0000823\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"channelId\": \"VAM\",\n" +
                "                \"virtualAccountNumber\": \"AG5555501\",\n" +
                "                \"virtualAccountName\": \"\",\n" +
                "                \"vaType\": \"Customer Virtual Account Number\",\n" +
                "                \"rootVa\": \"AG55555\",\n" +
                "                \"transactionDate\": \"20-JUL-2022\",\n" +
                "                \"valueDateTime\": \"30-JUN-2022 23:11:12\",\n" +
                "                \"transactionCode\": \"TXN012\",\n" +
                "                \"transactionDescription\": \"\",\n" +
                "                \"narration\": \" CLEARING BULK CHQ DEPOSIT: REF_101XXXXXXXX01 \",\n" +
                "                \"status\": \"PENDING\",\n" +
                "                \"currency\": \"VND\",\n" +
                "                \"creditAmount\": \"\",\n" +
                "                \"debitAmount\": \"987.00\",\n" +
                "                \"runningBalance\": \"-26,112.00\",\n" +
                "                \"creditReferenceNumber\": \"VAM222010000001910\",\n" +
                "                \"paymentMode\": null,\n" +
                "                \"debitReferenceNumber\": \"EN520021\",\n" +
                "                \"xrequestId\": \"BM0000826\",\n" +
                "                \"x_request_id\": \"BM0000826\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    }

}
