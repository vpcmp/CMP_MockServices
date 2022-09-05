package com.vpbank.cmp.mockservices.service.impl.liquidityServicesImpl;

import com.vpbank.cmp.mockservices.service.liquidityServices.UnlockAcctPostingServices;
import org.springframework.stereotype.Service;


@Service
public class UnlockAcctPostingServicesImpl implements UnlockAcctPostingServices {
    @Override
    public String unlockAcctPostingServices() {
        return "{\n" +
                "    \"referenceNumber\": null,\n" +
                "    \"transactionId\": \"32170609\",\n" +
                "    \"transferResult\": \"Success\",\n" +
                "    \"transferTime\": \"2022-05-30 10:20:43\",\n" +
                "    \"status\": \"Success\",\n" +
                "    \"message\": null\n" +
                "}";
    }

}
