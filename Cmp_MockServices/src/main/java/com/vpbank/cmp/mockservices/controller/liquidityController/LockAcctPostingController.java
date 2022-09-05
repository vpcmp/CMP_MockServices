package com.vpbank.cmp.mockservices.controller.liquidityController;

import com.vpbank.cmp.mockservices.model.LockAcctPosting;
import com.vpbank.cmp.mockservices.service.liquidityServices.LockAcctPostingServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/corporate/liquidity/v1/lockAcct")
@RequiredArgsConstructor
public class LockAcctPostingController {
    private final LockAcctPostingServices lockAcctPostingServices;

    @PostMapping
    String acctPosting(@ModelAttribute LockAcctPosting lockAcctPosting) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        return lockAcctPostingServices.lockAcctPostingServices();

    };

}
