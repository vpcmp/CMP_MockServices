
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.vpbank.cmp.mockservices.service.vituralAccountServices.CreateAccountServices;
import org.springframework.stereotype.Service;


@Service
public class CreateAccountServicesImpl implements CreateAccountServices {
    @Override
    public String createAccountServices() {
        return "{\n" +
                "\n" +
                "    \"context\": {\n" +
                "\n" +
                "        \"interfaceId\": \"VANUMBERCREATE_E_VALIDATION\",\n" +
                "\n" +
                "        \"channelId\": \"API\",\n" +
                "\n" +
                "        \"bankEntityId\": \"IGTBVN\",\n" +
                "\n" +
                "        \"status\": \"SUCCESS\",\n" +
                "\n" +
                "        \"error\": \"\",\n" +
                "\n" +
                "        \"message\": \"\",\n" +
                "\n" +
                "        \"xrequestId\": \"VAM222300000004051\",\n" +
                "\n" +
                "        \"x_request_id\": \"VAM222300000004051\"\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}";
    }

}
