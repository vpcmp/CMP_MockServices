//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.service.paymentServices.InternalTransactionInfoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/accounts/ca")
@RequiredArgsConstructor
public class InternalTransactionInfoController {

    private final InternalTransactionInfoServices internalTransactionInfoServices;

    @GetMapping
    String getInternalTransactionInfoServices(@RequestParam("id") String id) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return internalTransactionInfoServices.getInternalTransactionInfoServices(id);
    }

}
