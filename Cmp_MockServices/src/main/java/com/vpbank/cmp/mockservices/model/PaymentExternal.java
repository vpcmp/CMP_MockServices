package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentExternal {
    private int referenceNumber;
    private String transactionType;
    private int sourceNumber;
    private String benName;
    private int benNumber;
    private int amount;
    private String currency;
    private String remark;
    private String service;
    private String serviceChannel;
    private Array feeList;
    private int requestorCIF;
    private String custProfitDept;
    private String inputter;
    private String authoriser;
    private Array bank;
    private int bankId;
    private String baseCcy;
    private String bookingBranchId;
    private int creditAmount;
    private String creditCurrency;
    private Boolean fxfoFlag;
    private String purpose;
    private String routingChannel;
   private int treasureRate;
}
