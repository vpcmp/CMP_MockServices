package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.accountServices.DepositDetailServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/accounts/sa")
@RequiredArgsConstructor

public class DepositDetailController {
    private final DepositDetailServices depositDetailServices;

    @GetMapping
    String getDepositDetailServices(@RequestParam("id") String id) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return depositDetailServices.getDepositDetailServices(id);
    }
}
