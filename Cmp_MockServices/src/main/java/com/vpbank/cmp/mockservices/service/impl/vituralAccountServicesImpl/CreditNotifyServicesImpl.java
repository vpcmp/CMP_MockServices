
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.vpbank.cmp.mockservices.service.vituralAccountServices.CreditNotifyServices;
import org.springframework.stereotype.Service;


@Service
public class CreditNotifyServicesImpl implements CreditNotifyServices {
    @Override
    public String creditNotifyServices() {
        return "{\n" +
                "    \"context\": {\n" +
                "        \"interfaceId\": \"VAMAINTENANCEINQUIRY_E_VIEW\",\n" +
                "        \"channelId\": \"H2H\",\n" +
                "        \"bankEntityId\": \"AE\",\n" +
                "        \"status\": \"Success\",\n" +
                "        \"error\": \"0\",\n" +
                "        \"message\": \"Success\",\n" +
                "        \"xrequestId\": \"H2H98743010\",\n" +
                "        \"x_request_id\": \"H2H98743010\"\n" +
                "    }\n" +
                "}";
    }

}
