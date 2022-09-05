package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInternaltransfer {
    private  String referenceNumber;
    private  String transactionType = "CASA";
    private int sourceNumber;
    private int benNumber;
    private String benName;
    private int amount;
    private String currency= "VND";
    private String remark = "NA";
    private String service = "CMP-H2H";
    private String serviceChanne = "CMP";
    private String bookingBranchId;
    private Array feeList;
    private int requestorCIF;
    private String custProfitDept ="";
    private String inputter ="";
    private String authoriser ="";
    private int treasureRate;
    private CreditAmtObj creditAmtObj;
    private String baseCcy;
    private String purpose;
    private String fxfoFlag;
    private String prCardNo;
}

class CreditAmtObj {
    private String currency= "VND";
}