package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LockAcctPosting {
   private List<AccountList> accountList;
}
class AccountList {
    private String accNumber;
    private String accType;
    private String dateTime;
    private String postingRestrict;
    private String sweepingStatus;
}
