package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaintainceAccount {
   private ContextMaintaince context;
   private PayloadMaintaince payload;
}
class PayloadMaintaince{
   private String action;
   private String cif;
   private String customerRootVa;
   private String status;
   private String userId;
   private String vaMaintenanceFromDate;
   private String vaMaintenanceUpToDate;
   private String vaNumber;
   private String vaProduct;
   private String vaType;
}
class ContextMaintaince{
   private String bankCode;
   private String branchCode;
   private String customerCode;
   private String customerGuid;
   private String groupCustomerCode;
   private String userId;
}

