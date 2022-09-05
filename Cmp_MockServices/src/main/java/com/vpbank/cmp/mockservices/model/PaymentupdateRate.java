package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentupdateRate {
    private int buyRate;
    private String currency;
    private int middRate;
    private int sellRate;
    }
