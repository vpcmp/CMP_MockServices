package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LedgeUpdate {
   private ContextLedge context;
   private PayloadLedge payload;
}
class ContextLedge {
   private String bankCode;
   private String branchCode;
   private String customerCode;
   private String customerGuid;
   private String groupCustomerCode;
   private String userId;
};
class PayloadLedge{
   private String transactionID;
   private List<Transaction> transactions;
};

class Transaction{
   private String bookingDate;
   private String branchcode;
   private String customerTranRefNumber;
   private String destinationBicCode;
   private String destinationRoutingNumber;
   private String financialPosting;
   private String fxRate;
   private String hostDate;
   private String instrumentNumber;
   private String instrumentType;
   private List<Leg> legs;
   private String mandateRefNumber;
   private String pcTime;
   private String sequence;
   private String tellerID;
   private String transactionDate;
   private String transactionId;
   private String txnBank;
   private String txnBicCode;
   private String txnBranch;
   private String txnCode;
   private String txnRountingNumber;
}
class Leg{
   private String accountCCY;
   private String amount;
   private String debitCreditFlg;
   private String remark;
   private String tranParticular1;
   private String tranParticular2;
   private String virtualAccountNumber;
   private String virtualName;
}
