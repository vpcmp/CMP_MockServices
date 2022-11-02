
package com.vpbank.cmp.mockservices.service.impl.vituralAccountServicesImpl;


import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.NotificationServices;
import org.springframework.stereotype.Service;


@Service
public class NotificationServicesImpl implements NotificationServices {
    @Override
    @LogExecutionTime
    public String notificationServices() {
        return " {\n" +
                "    \"interfaceId\": \"VAACCOUNTING_P_PROCESS\",\n" +
                "    \"channelId\": \"BM\",\n" +
                "    \"bankEntityId\": \"AE\",\n" +
                "    \"status\": \"SUCCESS\",\n" +
                "    \"errorCode\": \"\",\n" +
                "    \"errorMessage\": \"\",\n" +
                "    \"transactionId\": null\n" +
                "}";
    }

}
