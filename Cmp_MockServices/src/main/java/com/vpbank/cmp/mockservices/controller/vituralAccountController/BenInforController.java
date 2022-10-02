package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.BenInforServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="virtual-account/v1/virtual-account/cmp/getBenInfo")
@RequiredArgsConstructor
public class BenInforController {

    private final BenInforServices benInforServices;

    @GetMapping()
    String getbenInforServices(@RequestParam("benNumber") String benNumber) throws InterruptedException {
        Common.Delay();
        return benInforServices.getbenInforServices(benNumber);
    }

}
