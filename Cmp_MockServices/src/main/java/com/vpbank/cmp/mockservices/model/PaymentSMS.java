package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentSMS {
    private int phoneNumber;
    private String smsText;
    private String requestBranch;
    private String messageType;
    private String groupMsg;
    private String tplCode;
}
