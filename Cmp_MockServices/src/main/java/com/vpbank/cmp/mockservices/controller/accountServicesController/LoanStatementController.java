package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.accountServices.LoanStatementServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/accounts/ld/stmt")
@RequiredArgsConstructor

public class LoanStatementController {
    private final LoanStatementServices loanStatementServices;

    @GetMapping
    String getLoanStatementServices(@RequestParam("id") String id) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return loanStatementServices.getLoanStatementServices(id);
    }
}
