
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ModifyAccountServices;
import org.springframework.stereotype.Service;


@Service
public class ModifyAccountServicesImpl implements ModifyAccountServices {
    @Override
    @LogExecutionTime
    public String modifyAccountServices() {
        return "{\n" +
                "    \"context\": {\n" +
                "        \"interfaceId\": \"VANUMBERMODIFY_E_VALIDATION\",\n" +
                "        \"channelId\": \"H2H\",\n" +
                "        \"bankEntityId\": \"AE\",\n" +
                "        \"status\": \"SUCCESS\",\n" +
                "        \"error\": \"\",\n" +
                "        \"message\": \"\",\n" +
                "        \"xrequestId\": \"H2H98743010\",\n" +
                "        \"x_request_id\": \"H2H98743010\"\n" +
                "    }\n" +
                "}";
    }

}
