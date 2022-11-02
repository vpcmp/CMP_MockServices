package com.vpbank.cmp.mockservices.service.impl.liquidityServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.liquidityServices.LockAcctPostingServices;
import org.springframework.stereotype.Service;


@Service
public class LockAcctPostingServicesImpl implements LockAcctPostingServices {
    @Override
    @LogExecutionTime
    public String lockAcctPostingServices() {
        return "{\n" +
                "    \"status\": \"Success\",\n" +
                "    \"resultCode\": \"200\",\n" +
                "    \"resultMsg\": \"Lock Account successful!\"\n" +
                "}";
    }

}
