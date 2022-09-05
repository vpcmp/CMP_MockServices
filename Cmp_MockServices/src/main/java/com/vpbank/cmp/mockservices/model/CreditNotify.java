package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditNotify {
   private ContextCreditNotify context;
   private PayloadCreditNotify payload;
}

class ContextCreditNotify{
   private String bankCode;
   private String branchCode;
   private String customerCode;
   private String customerGuid;
   private String groupCustomerCode;
   private String userId;
};
class PayloadCreditNotify{
   private List<TransactionCreditNotify> transactions;
};
class TransactionCreditNotify{
   private String amount;
   private String beneBankBicCode;
   private String beneBankRountingNumber;
   private String bookingDate;
   private String currency;
   private String customerTranRefNumber;
   private String debitCreditFlg;
   private String masterAccountNumber;
   private String payerBankBicCode;
   private String payerBankRoutingNumber;
   private String realAccountName;
   private String remark;
   private String tranParticular1;
   private String tranParticular2;
   private String transactionDate;
   private String transactionId;
   private String txnCode;
   private String virtualAccountNumber;
   private String virtualName;
}