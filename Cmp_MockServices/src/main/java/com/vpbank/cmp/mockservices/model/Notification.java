package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
   private MainInfo mainInfo;
   private OtherInfo otherInfo;
}
class OtherInfo{
   private String isRetry;
}
class MainInfo {
   private String amount;
   private String bookingDate;
   private String masterAccountNumber;
   private String remark;
   private String transactionDate;
   private String transactionId;
   private String virtualAccountNumber;
}