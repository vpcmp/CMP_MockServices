package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClosureAccount {
   private ContextClosure context;
   private PayloadClosure payload;
}
class PayloadClosure{
   private String closureDate;
   private String narrationForClosureVA;
   private String narrationForSettlementVA;
   private String partnerCode;
   private String reasonForClosure;
   private String settlementAccountNumber;
   private String virtualAccountNumber;
   private String virtualAccountOpeningDate;
}
class ContextClosure{
   private String bankCode;
   private String branchCode;
   private String customerCode;
   private String customerGuid;
   private String groupCustomerCode;
   private String userId;
}

