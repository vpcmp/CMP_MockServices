package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.accountServices.DepositDetailESAServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/accounts/esa")
@RequiredArgsConstructor

public class DepositDetailESAController {
    private final DepositDetailESAServices depositDetailESAServices;

    @GetMapping
    String getDepositDetailESAServices(@RequestParam("id") String id) throws InterruptedException {
        Common.Delay();
        return depositDetailESAServices.getDepositDetailESAServices(id);
    }
}
