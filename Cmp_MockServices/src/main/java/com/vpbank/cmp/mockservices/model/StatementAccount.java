package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatementAccount {
   private ContextStatement context;
   private PayloadStatement payload;

}
class ContextStatement{
   private String bankCode;
   private String branchCode;
   private String customerCode;
   private String customerGuid;
   private String groupCustomerCode;
   private String userId;
}
class PayloadStatement{
   private String cif;
   private String consolidationViewMode;
   private String transactionCurrency;
   private String vaNumber;
   private String vaType;
   private String valueFromDate;
   private String valueUpToDate;
}
