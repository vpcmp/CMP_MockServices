package com.vpbank.cmp.mockservices.service.impl.smartOTPImpl;

import com.vpbank.cmp.mockservices.service.smartOTPServices.CreateTransactionServices;
import com.vpbank.cmp.mockservices.service.smartOTPServices.SmartOTPgetActivationCodeServices;
import org.springframework.stereotype.Service;


@Service
public class CreateTransactionServicesImpl implements CreateTransactionServices {
    @Override
    public String createTransactionServices() {
        return "{\n" +
                "    \"userId\": \"B2B_LINHCIB_G4\",\n" +
                "    \"transactionId\": \"VPB202204020000045864GUID7667\",\n" +
                "    \"transactionTypeId\": \"4\",\n" +
                "    \"transactionData\": \"U0tGYWx6TTViQ0IwN3hqWOOh8cstLr+EFCi+ICBOEq31am7rGkjpuG4iY5hduijSdUqpPvgQrqjAo3PEoFzBDQ==\",\n" +
                "    \"transactionStatus\": \"1\",\n" +
                "    \"challenge\": \"285867\",\n" +
                "    \"isOnline\": \"0\",\n" +
                "    \"eSignerTypeId\": \"7\",\n" +
                "    \"channelId\": \"0\"\n" +
                "}";
    }

}
