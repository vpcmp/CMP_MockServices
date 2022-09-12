package com.vpbank.cmp.mockservices.controller.liquidityController;

import com.vpbank.cmp.mockservices.model.UnlockAcctPosting;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.liquidityServices.UnlockAcctPostingServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@Slf4j
@RestController
@RequestMapping(path="/corporate/liquidity/v1/unlockAcct")
@RequiredArgsConstructor

public class UnlockAcctPostingController {
    private final UnlockAcctPostingServices unlockAcctPostingServices;

    @PostMapping

    String acctPosting(@ModelAttribute UnlockAcctPosting unlockAcctPosting, @RequestHeader Map<String, String> headers) throws InterruptedException {
        Common.getDelay();
        headers.forEach((key, value) -> {log.info(String.format("Header '%s' = %s", key, value));
        });
        return unlockAcctPostingServices.unlockAcctPostingServices();


    };

}
