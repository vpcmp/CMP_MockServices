
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ClosureAccountServices;
import org.springframework.stereotype.Service;


@Service
public class ClosureAccountServicesImpl implements ClosureAccountServices {
    @Override
    @LogExecutionTime
    public String closureAccountServices() {
        return "{\n" +
                "    \"context\": {\n" +
                "        \"interfaceId\": \"VACLOSURECREATE_E_VALIDATION\",\n" +
                "        \"channelId\": \"API\",\n" +
                "        \"bankEntityId\": \"VPBANK\",\n" +
                "        \"status\": \"SUCCESS\",\n" +
                "        \"error\": \"0\",\n" +
                "        \"message\": \"SUCCESS\",\n" +
                "        \"xrequestId\": \"VAM221750000000489\",\n" +
                "        \"x_request_id\": \"VAM221750000000489\"\n" +
                "    }\n" +
                "}";
    }

}
