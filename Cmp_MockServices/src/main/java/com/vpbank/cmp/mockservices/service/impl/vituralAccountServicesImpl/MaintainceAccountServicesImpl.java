
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;
import  com.vpbank.cmp.mockservices.service.vituralAccountServices.MaintainceAccountServices;
import org.springframework.stereotype.Service;

@Service
public class MaintainceAccountServicesImpl implements MaintainceAccountServices {
    @Override
    public String maintainceAccountServices() {
        return "{\n" +
                "    \"context\": {\n" +
                "        \"interfaceId\": \"VAMAINTENANCEINQUIRY_E_VIEW\",\n" +
                "        \"channelId\": \"API\",\n" +
                "        \"bankEntityId\": \"IGTBVN\",\n" +
                "        \"status\": \"Success\",\n" +
                "        \"error\": \"0\",\n" +
                "        \"message\": \"Success\",\n" +
                "        \"xrequestId\": \"111111111111112333\",\n" +
                "        \"x_request_id\": \"111111111111112333\"\n" +
                "    },\n" +
                "    \"payload\": {\n" +
                "        \"inquiryDetails\": [\n" +
                "            {\n" +
                "                \"action\": \"Add\",\n" +
                "                \"status\": \"Active\",\n" +
                "                \"cif\": \"76829\",\n" +
                "                \"customerRootVa\": \"NE241186\",\n" +
                "                \"parentVANumber\": \"NE241186\",\n" +
                "                \"vaType\": \"CV\",\n" +
                "                \"vaCreationMethod\": \"Manual Create\",\n" +
                "                \"virtualAccountNumber\": \"NE2411861\",\n" +
                "                \"virtualAccountName\": \"NE\",\n" +
                "                \"vaAliasName\": \"NE\",\n" +
                "                \"vaIbanNumber\": \"\",\n" +
                "                \"actualAccountDetails\": [\n" +
                "                    {\n" +
                "                        \"actualAccountNumber\": \"241901367\",\n" +
                "                        \"actualAccountName\": \"NGUYEN MANH CUONG ACF\",\n" +
                "                        \"currency\": \"VND\",\n" +
                "                        \"currencyDesc\": \"VIETNAMESE DONG\",\n" +
                "                        \"setAsDefault\": \"Yes\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"vaOwnerAddress\": [\n" +
                "                    {\n" +
                "                        \"country\": \"\",\n" +
                "                        \"postalCode\": \"\",\n" +
                "                        \"state\": \"\",\n" +
                "                        \"city\": \"\",\n" +
                "                        \"address\": \"  \",\n" +
                "                        \"address1\": \"\",\n" +
                "                        \"address2\": \"\",\n" +
                "                        \"address3\": \"\",\n" +
                "                        \"phoneNumber\": \"\",\n" +
                "                        \"mobileNumber\": \"\",\n" +
                "                        \"email\": \"  \",\n" +
                "                        \"emailAddress1\": \"\",\n" +
                "                        \"emailAddress2\": \"\",\n" +
                "                        \"emailAddress3\": \"\",\n" +
                "                        \"remarks\": \"  \",\n" +
                "                        \"remarks1\": \"\",\n" +
                "                        \"remarks2\": \"\",\n" +
                "                        \"remarks3\": \"\"\n" +
                "                    }\n" +
                "                ],\n" +
                "                \"recordMode\": \"Active\",\n" +
                "                \"channelId\": \"VAM\",\n" +
                "                \"channelRefNumber\": \"VAM221970000001665\",\n" +
                "                \"creationDate\": \"15-JUL-2022\",\n" +
                "                \"expiryClosureDate\": \"\",\n" +
                "                \"reasonForClosure\": \"\",\n" +
                "                \"settlementVaForClosure\": \"\",\n" +
                "                \"narrationForClosureVA\": \"\",\n" +
                "                \"narrationForSettlementVA\": \"\",\n" +
                "                \"enteredBy\": \"VPMKR1\",\n" +
                "                \"enteredOn\": \"15-07-2022 11:14:12 AM\",\n" +
                "                \"authorisedBy\": \"VPCKR1\",\n" +
                "                \"authorisedOn\": \"15-07-2022 11:14:24 AM\",\n" +
                "                \"rejectedBy\": \"\",\n" +
                "                \"rejectedOn\": \"\",\n" +
                "                \"errorDesc\": \"\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    }

}
