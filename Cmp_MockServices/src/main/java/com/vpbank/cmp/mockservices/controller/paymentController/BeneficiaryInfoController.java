//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.service.paymentServices.BeneficiaryInfoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/payments/v1/beneficiary/info")
@RequiredArgsConstructor
public class BeneficiaryInfoController {

    private final BeneficiaryInfoServices beneficiaryInfoServices;

    @GetMapping
    String getBeneficiaryInfoServices(@RequestParam("benType") String benType) {
        return beneficiaryInfoServices.getBeneficiaryInfoServices(benType);
    }

}
