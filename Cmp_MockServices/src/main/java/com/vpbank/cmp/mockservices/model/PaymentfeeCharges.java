package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentfeeCharges {
    private int referenceNumber;
    private String chargeType;
    private int customerNo;
    private String remark;
    private ChargeInfo chargeInfo;

}
class ChargeInfo {
    private String detail;
    private int date;
    private int account;
    private String branchNo;
    private List<CodeList> codeList;
    private List<String> suspenseTxnList;
}
class CodeList {
    private String code;
    private String amount;
}
