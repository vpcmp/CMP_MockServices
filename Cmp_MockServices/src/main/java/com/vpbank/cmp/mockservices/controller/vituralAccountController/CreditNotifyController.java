package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.CreditNotify;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.CreditNotifyServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/creditNotify")
@RequiredArgsConstructor
public class CreditNotifyController {

    private final CreditNotifyServices creditNotifyServices;

    @PostMapping
    String creditnotify(@ModelAttribute CreditNotify creditNotify) throws InterruptedException {
        Common.Delay();
        return creditNotifyServices.creditNotifyServices();

    };

}
