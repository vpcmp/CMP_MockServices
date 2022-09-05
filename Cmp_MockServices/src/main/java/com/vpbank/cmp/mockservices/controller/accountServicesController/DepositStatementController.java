package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.accountServices.DepositStatementServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/accounts/statement")
@RequiredArgsConstructor

public class DepositStatementController {
    private final DepositStatementServices depositStatementServices;

    @GetMapping
    String getDepositStatementServices(
            @RequestParam("id") String id,
            @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "frdate", required = false) String fDate,
            @RequestParam(value = "todate", required = false) String toDate) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return depositStatementServices.getDepositStatementServices(id,type,fDate,toDate);
    }
}
