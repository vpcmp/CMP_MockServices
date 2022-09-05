package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmartOTPgetActivationCode {
    private String userId;
    private int aidVersion;
    private String customerName;
    private int customerCode;
    private int phoneNumber;
    private String branchCode;
    private String emailAddress;
    private String userName;

}
