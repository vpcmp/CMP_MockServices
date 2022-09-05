
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;

import com.vpbank.cmp.mockservices.service.vituralAccountServices.LedgeUpdateServices;
import org.springframework.stereotype.Service;


@Service
public class LedgeUpdateServicesImpl implements LedgeUpdateServices {
    @Override
    public String ledgeUpdateServices() {
        return "{\n" +
                "    \"context\": {\n" +
                "        \"interfaceId\": \"VAACCOUNTING_P_PROCESS\",\n" +
                "        \"channelId\": \"BM\",\n" +
                "        \"bankEntityId\": \"AE\",\n" +
                "        \"status\": \"SUCCESS\",\n" +
                "        \"error\": \"\",\n" +
                "        \"message\": \"\",\n" +
                "        \"xrequestId\": \" BM98743010 \",\n" +
                "        \"x_request_id\": \" BM98743010 \"\n" +
                "    }\n" +
                "}";
    }

}
