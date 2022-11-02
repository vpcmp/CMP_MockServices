package com.vpbank.cmp.mockservices.service.impl.paymentServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.service.paymentServices.BeneficiaryInfoServices;
import org.springframework.stereotype.Service;


@Service
public class BeneficiaryInfoServicesImpl implements BeneficiaryInfoServices {
    @Override
    @LogExecutionTime
    public String getBeneficiaryInfoServices(String benType) {
        return "{\n" +
                "    \"beneficiaryName\": \"NGUYEN VAN NAPAS\"\n" +
                "}";
    }

}
