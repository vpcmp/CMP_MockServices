
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.vpbank.cmp.mockservices.service.vituralAccountServices.ValidationServices;
import org.springframework.stereotype.Service;


@Service
public class ValidationServicesImpl implements ValidationServices {
    @Override
    public String validationServices() {
        return "{\n" +
                "    \"context\": {\n" +
                "        \"interfaceId\": \"VAVALIDATE_E_VALIDATION\",\n" +
                "        \"channelId\": \"API\",\n" +
                "        \"bankEntityId\": \"IGTBVN\",\n" +
                "        \"status\": \"Success\",\n" +
                "        \"error\": \"0\",\n" +
                "        \"message\": \"Success\",\n" +
                "        \"xrequestId\": \"H2H98743010\",\n" +
                "        \"x_request_id\": \"H2H98743010\"\n" +
                "    },\n" +
                "    \"payload\": {\n" +
                "        \"vaNumber\": \"C055511001\",\n" +
                "        \"vaName\": \"VAN_C055511001\",\n" +
                "        \"vaAliasName\": \"\",\n" +
                "        \"vaIBAN\": \"\",\n" +
                "        \"payerCode\": \"C055511\",\n" +
                "        \"rootVa\": \"C055511\",\n" +
                "        \"vaType\": \"CV\",\n" +
                "        \"customerID\": \"6503210\",\n" +
                "        \"customerName\": \"VPBANK-6503210 VPBANK-6503210\",\n" +
                "        \"intermediaryAccountNumber\": \"VND1301400050001\",\n" +
                "        \"realAccountNumber\": \"226503153\",\n" +
                "        \"realAccountCurrency\": \"VND\",\n" +
                "        \"realAccountName\": \"VPBANK-226503153 CATEG1001\",\n" +
                "        \"accountCreditFlag\": \"I\",\n" +
                "        \"vaBalance\": \"\",\n" +
                "        \"guid\": \"ae5b1518-37be-5370-8d4e-cc704f4857c6\",\n" +
                "        \"payerID\": \"\",\n" +
                "        \"payerName\": \"\",\n" +
                "        \"vaExpiryDate\": \"\",\n" +
                "        \"vaStatus\": \"A\",\n" +
                "        \"mobileNumber\": \"\",\n" +
                "        \"emailId\": \"\",\n" +
                "        \"transactionCurrency\": \"\",\n" +
                "        \"realAccountList\": [\n" +
                "            {\n" +
                "                \"transactionCurrency\": \"VND\",\n" +
                "                \"realAccountNumber\": \"226503153\",\n" +
                "                \"realAccountCurrency\": \"VND\",\n" +
                "                \"realAccountName\": \"VPBANK-226503153 CATEG1001\",\n" +
                "                \"defaultFlag\": \"Y\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    }

}
