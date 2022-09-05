package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentMT103 {
    private int atmRefNo;
    private String debitAccountNumber;
    private String debitCurrency;
    private String orderingCustomer;

}
