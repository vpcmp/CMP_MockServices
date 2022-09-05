package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentFXFO {
    private int cif;
    private int paymentAmount;
    private String paymentCcy;
    private int debitAmount;
    private String debitCcy;
    private String segment;
    private String channel;
    private String rateType;

}
