package com.vpbank.cmp.mockservices.service.impl.liquidityServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.liquidityServices.BackdateTransactionServices;
import org.springframework.stereotype.Service;


@Service
public class BackdateTransactionServicesImpl implements BackdateTransactionServices {
    @Override
    @LogExecutionTime
    public String backdateTransactionServices() {
        return "{\n" +
                "    \"referenceNumber\": \"CMP400000000000000002\",\n" +
                "    \"transactionId\": \"FT21221383456088\",\n" +
                "    \"transferResult\": null,\n" +
                "    \"status\": \"complete\",\n" +
                "    \"accountNumber\": null,\n" +
                "    \"resultCode\": null,\n" +
                "    \"resultMsg\": null\n" +
                "}";
    }

}
