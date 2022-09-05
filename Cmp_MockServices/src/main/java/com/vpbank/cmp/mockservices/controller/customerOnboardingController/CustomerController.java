//Customer On-Boarding - Customer Information Interface

package com.vpbank.cmp.mockservices.controller.customerOnboardingController;

import com.vpbank.cmp.mockservices.service.customerOnboardingServices.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cas/cashs/1.0/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    String getCustomerInfo(@RequestParam("cif") String cif) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return customerService.getCustomerInfo(cif);
    }
}
