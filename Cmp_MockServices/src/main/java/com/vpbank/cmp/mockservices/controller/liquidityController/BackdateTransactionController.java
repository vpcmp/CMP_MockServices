package com.vpbank.cmp.mockservices.controller.liquidityController;

import com.vpbank.cmp.mockservices.model.BackdateTransaction;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.liquidityServices.BackdateTransactionServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping(path="/corporate/liquidity/v1/backDateTrans")
@RequiredArgsConstructor

public class BackdateTransactionController {
    private final BackdateTransactionServices backdateTransactionServices;
    @PostMapping
    String backdate(@ModelAttribute BackdateTransaction backdateTransaction, @RequestHeader Map<String, String> headers) throws InterruptedException {
        Common.Delay();
        headers.forEach((key, value) -> {log.info(String.format("Header '%s' = %s", key, value));
        });
        return backdateTransactionServices.backdateTransactionServices();
    };
}
