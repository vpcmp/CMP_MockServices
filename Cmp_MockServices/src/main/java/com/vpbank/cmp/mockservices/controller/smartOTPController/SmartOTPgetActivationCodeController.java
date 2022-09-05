//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.smartOTPController;

import com.vpbank.cmp.mockservices.model.SmartOTPgetActivationCode;
import com.vpbank.cmp.mockservices.service.smartOTPServices.SmartOTPgetActivationCodeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/payments/sotp/code-active")
@RequiredArgsConstructor
public class SmartOTPgetActivationCodeController {

    private final SmartOTPgetActivationCodeServices getsmartOTPgetActivationCodeServices;

    @PostMapping
    String getsmartOTPgetActivationCode(@ModelAttribute SmartOTPgetActivationCode smartOTPgetActivationCode) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return getsmartOTPgetActivationCodeServices.getsmartOTPgetActivationCodeServices();

    };

}
