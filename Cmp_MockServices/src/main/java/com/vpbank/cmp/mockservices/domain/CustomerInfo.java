package com.vpbank.cmp.mockservices.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInfo {
    private String customerNumber;
    private String customerName;
    private String shortName;
    private String dateOfBirth;
}
