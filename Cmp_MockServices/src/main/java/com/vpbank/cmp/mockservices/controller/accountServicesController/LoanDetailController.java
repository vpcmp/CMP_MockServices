package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.accountServices.LoanDetailServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/accounts/ld")
@RequiredArgsConstructor

public class LoanDetailController {
    private final LoanDetailServices loanDetailServices;

    @GetMapping
    String getLoanDetailServices(@RequestParam("id") String id) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return loanDetailServices.getLoanDetailServices(id);
    }
}
