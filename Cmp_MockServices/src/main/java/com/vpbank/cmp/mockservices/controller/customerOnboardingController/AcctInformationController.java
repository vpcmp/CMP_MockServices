package com.vpbank.cmp.mockservices.controller.customerOnboardingController;

import com.vpbank.cmp.mockservices.service.Common;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.vpbank.cmp.mockservices.service.customerOnboardingServices.AcctInformationServices;

@RestController
@RequestMapping(path="/cas/cashs/1.0/products")
@RequiredArgsConstructor
public class AcctInformationController {

    private final AcctInformationServices acctInformationServices;

    @GetMapping
    String getAcctInformationService(
            @RequestParam("id") String id,
            @RequestParam(value = "types", required = false) String types) throws InterruptedException {
        Common.Delay();
        return acctInformationServices.getAcctInformationService(id,types);
    }

}
