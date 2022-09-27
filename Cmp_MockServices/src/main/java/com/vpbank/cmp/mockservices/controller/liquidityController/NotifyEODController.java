package com.vpbank.cmp.mockservices.controller.liquidityController;

import com.vpbank.cmp.mockservices.model.NotifyEOD;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.liquidityServices.NotifyEODServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/MH/RESTWS/ServicePost")
@RequiredArgsConstructor
public class NotifyEODController {
    private final NotifyEODServices notifyEODServices;

    @PostMapping
    String acctPosting(@ModelAttribute NotifyEOD NotifyEOD) throws InterruptedException {
        Common.Delay();
        return notifyEODServices.notifyEODServices();

    };

}
