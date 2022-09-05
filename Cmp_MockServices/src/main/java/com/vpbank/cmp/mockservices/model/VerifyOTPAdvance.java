package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerifyOTPAdvance {
    private String userId;
    private int oTPNumber;
    private String transactionId;

}
