//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.smartOTPController;

import com.vpbank.cmp.mockservices.model.CreateTransaction;
import com.vpbank.cmp.mockservices.model.VerifyOTPAdvance;
import com.vpbank.cmp.mockservices.service.smartOTPServices.CreateTransactionServices;
import com.vpbank.cmp.mockservices.service.smartOTPServices.VerifyOTPAdvanceServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cas/cashs/1.0/payments/sotp/verify")
@RequiredArgsConstructor
public class VerifyOTPAdvanceController {

    private final VerifyOTPAdvanceServices verifyOTPAdvanceServices;

    @PostMapping
    String getOTPadvance(@ModelAttribute VerifyOTPAdvance verifyOTPAdvance) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return verifyOTPAdvanceServices.verifyOTPAdvanceServices();

    };

}
