package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAccount {
   private Context context;
   private Payload payload;
}

 class Payload{
   private String mainCustomerNo;
   private String customerRootVa;
   private List<VirtualAccount> virtualAccounts;
}

class VirtualAccount{
   private String expiryDate;
   private String partnerCode;
   private String status;
   private String vaType;
   private String virtualAccName;
   private String virtualAccNo;
   private String virtualMobile;
}
class Context{
   private String bankCode;
   private String branchCode;
   private String customerCode;
   private String customerGuid;
   private String groupCustomerCode;
   private String userId;
}
