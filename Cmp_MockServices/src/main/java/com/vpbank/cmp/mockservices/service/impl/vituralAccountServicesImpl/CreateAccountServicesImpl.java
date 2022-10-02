
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.vpbank.cmp.mockservices.service.vituralAccountServices.CreateAccountServices;
import org.springframework.stereotype.Service;


@Service
public class CreateAccountServicesImpl implements CreateAccountServices {
    @Override
    public String createAccountServices() {
        return "{\n" +
                "  \"context\": {\n" +
                "    \"interfaceId\": \"VANUMBERCREATE_E_VALIDATION\",\n" +
                "    \"channelId\": \"API\",\n" +
                "    \"bankEntityId\": \"IGTBVN\",\n" +
                "    \"status\": \"SUCCESS\",\n" +
                "    \"error\": \"\",\n" +
                "    \"message\": \"\",\n" +
                "    \"xrequestId\": \"VAM222300000004051\",\n" +
                "    \"x_request_id\": \"VAM222300000004051\"\n" +
                "  }\n" +
                "}";
    }

}
