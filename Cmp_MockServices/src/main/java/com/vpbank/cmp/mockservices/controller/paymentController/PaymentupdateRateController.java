package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.model.PaymentupdateRate;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.paymentServices.PaymentupdateRateServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/payments/fxfo/upd-rate")
@RequiredArgsConstructor
public class PaymentupdateRateController {

    private final PaymentupdateRateServices getpaymentupdateRateServices;

    @PostMapping
    String getpaymentupdateRate(@ModelAttribute PaymentupdateRate paymentupdateRate) throws InterruptedException {
        Common.Delay();
        return getpaymentupdateRateServices.getpaymentupdateRateServices();

    };

}
