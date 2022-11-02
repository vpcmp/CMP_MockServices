package com.vpbank.cmp.mockservices.controller.smartOTPController;

import com.vpbank.cmp.mockservices.model.VerifyOTPAdvance;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.smartOTPServices.VerifyOTPAdvanceServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/cas/cashs/payments/sotp/verify")
@RequiredArgsConstructor
public class VerifyOTPAdvanceController {

    private final VerifyOTPAdvanceServices verifyOTPAdvanceServices;

    @PutMapping
    String getOTPadvance(@ModelAttribute VerifyOTPAdvance verifyOTPAdvance) throws InterruptedException {
        Common.Delay();
        return verifyOTPAdvanceServices.verifyOTPAdvanceServices();

    };

}
