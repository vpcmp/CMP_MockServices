//Customer On-Boarding - Account Information Interface  (Casa, Loan and Deposit)
package com.vpbank.cmp.mockservices.controller.customerOnboardingController;

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
            @RequestParam("cif") String cif,
            @RequestParam(value = "types", required = false) String types) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return acctInformationServices.getAcctInformationService(cif,types);
    }

}
