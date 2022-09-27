package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.accountServices.AcctSummaryServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/accounts/ca/list")
@RequiredArgsConstructor
public class AcctSummaryController {

    private final AcctSummaryServices acctSummaryServices;

    @GetMapping
    String getAcctSummaryServices(@RequestParam("cif") String cif) throws InterruptedException {
        Common.Delay();
        return acctSummaryServices.getAcctSummaryServices(cif);
    }

}
