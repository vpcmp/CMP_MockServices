package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.accountServices.CreditAdviceServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/accounts/info-advices")
@RequiredArgsConstructor

public class CreditAdviceController {
    private final CreditAdviceServices creditAdviceServices;

    @GetMapping
    String getCreditAdviceServices(
            @RequestParam("debitCreditFlag")  String debitCreditFlag,
            @RequestParam(value = "id", required = true ) String id) throws InterruptedException {
        Common.Delay();
        return creditAdviceServices.getCreditAdviceServices(debitCreditFlag,id);
    }
}
