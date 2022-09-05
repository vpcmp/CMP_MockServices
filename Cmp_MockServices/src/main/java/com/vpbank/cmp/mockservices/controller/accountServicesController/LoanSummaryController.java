package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.accountServices.LoanSummaryServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/accounts/ld/list")
@RequiredArgsConstructor

public class LoanSummaryController {

    private final LoanSummaryServices loanSummaryServices;

    @GetMapping
    String getLoanSummaryServices(@RequestParam("cif") String cif) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return loanSummaryServices.getLoanSummaryServices(cif);
    }

}
