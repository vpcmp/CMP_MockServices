package com.vpbank.cmp.mockservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotifyEOD {
   private int currentWorkingDate;
   private int cobDate;
   private int eodStatus;
   private int nextWorkingDay;

}
