package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.accountServices.DepositSummaryServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path="/cas/cashs/1.0/products")
@RequiredArgsConstructor

public class DepositSummaryController {
    private final DepositSummaryServices depositSummaryServices;

    @GetMapping
    String getDepositSummaryServices(
            @RequestParam(value = "cif", required = true) String cif,
            @RequestParam(value = "types", required = true) String types) throws  InterruptedException{
        Common.Delay();
        return depositSummaryServices.getDepositSummaryServices(cif, types);
    }
}
