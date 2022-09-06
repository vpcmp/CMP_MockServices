package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.ClosureAccount;
import com.vpbank.cmp.mockservices.model.MaintainceAccount;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ClosureAccountServices;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.MaintainceAccountServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/maintain")
@RequiredArgsConstructor
public class MaintainceAccountController {

    private final MaintainceAccountServices maintainceAccountServices;

    @PostMapping
    String maintainceaccount(@ModelAttribute MaintainceAccount maintainceAccount) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return maintainceAccountServices.maintainceAccountServices();

    };

}
