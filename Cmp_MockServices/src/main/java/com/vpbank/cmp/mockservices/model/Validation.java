package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Validation {
   private ContextValidation context;
   private PayloadValidation payload;
}

class PayloadValidation{
   private String vaNumber;
   private String transactionCurrency;
}
class ContextValidation{
   private String bankCode;
   private String branchCode;
   private String customerCode;
   private String customerGuid;
   private String groupCustomerCode;
   private String userId;
}
