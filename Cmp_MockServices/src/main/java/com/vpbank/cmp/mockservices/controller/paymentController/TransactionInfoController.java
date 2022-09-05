//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.service.paymentServices.TransactionInfoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/payments/transfers/list")
@RequiredArgsConstructor
public class TransactionInfoController {

    private final TransactionInfoServices transactionInfoServices;

    @GetMapping
    String getTransactionInfoServices(@RequestParam("debitAccount") String debAcc,
                                      @RequestParam("refNo") String refNo) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return transactionInfoServices.getTransactionInfoServices(debAcc, refNo);
    }

}
