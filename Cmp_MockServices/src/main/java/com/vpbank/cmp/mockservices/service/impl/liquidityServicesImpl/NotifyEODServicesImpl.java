package com.vpbank.cmp.mockservices.service.impl.liquidityServicesImpl;

import com.vpbank.cmp.mockservices.service.liquidityServices.NotifyEODServices;
import org.springframework.stereotype.Service;


@Service
public class NotifyEODServicesImpl implements NotifyEODServices {
    @Override
    public String notifyEODServices() {
        return "{    \"referenceNumber\": 12,    \"transferResult\": '',    \"status\": \"complete\"}";
    }

}
