package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackdateTransaction {
    private String referenceNumber;
    private String transactionType;
    private String sourceNumber;
    private String benNumber;
    private String benName;
    private int amount;
    private String currency;
    private String valueDate;
    private String remark;
    private String service;
    private String serviceChannel;
    private String bookingBranchId;
    private List<FeeList> feeList;
    private String authoriser;
    private String baseCcy;
    private String custProfitDept;
    private String inputter;
    private String requestorCIF;
    private String treasureRate;
    private CreditAmount creditAmount;
}
class CreditAmount{
    private String currency;
}
class FeeList{
    private String accNumber;
    private int amount;
    private String category;
    private String code;
    private String currency;
    private String type;
    private int vatAmount;
    private String vatRate;
}
