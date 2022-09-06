//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.service.paymentServices.BankListServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/payments/v1/cash/banks")
@RequiredArgsConstructor
public class BankListController {

    private final BankListServices bankListServices;

    @GetMapping
    String getBranchListServices() throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return bankListServices.getBankListServices();
    }

}
