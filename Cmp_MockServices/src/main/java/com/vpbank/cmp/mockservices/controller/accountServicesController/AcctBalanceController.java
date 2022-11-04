package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.accountServices.AcctBalanceServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/accounts/balance")
@RequiredArgsConstructor
public class AcctBalanceController {

    private final AcctBalanceServices acctBalanceServices;

    @GetMapping
    String getAcctSummaryServices(@RequestParam("id") String id) throws InterruptedException {
        Common.Delay();
        return acctBalanceServices.getAcctBalanceServices(id);
    }

}
