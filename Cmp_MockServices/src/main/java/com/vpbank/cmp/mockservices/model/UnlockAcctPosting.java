package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnlockAcctPosting {
    private int transactionID;
    private int postingRestrict;
    private String vpbService;
    private String serviceChannel ="CMP";
    private String vpbAcStatus;
    private int vpbAcSttDate;
    private String vpbServiceChannel ="CMP";

}
