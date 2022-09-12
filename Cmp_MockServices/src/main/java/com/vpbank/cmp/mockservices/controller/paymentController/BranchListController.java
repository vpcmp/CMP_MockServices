//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.paymentController;

import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.paymentServices.BranchListServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/payments/v1/cash/branches")
@RequiredArgsConstructor
public class BranchListController {

    private final BranchListServices branchListServices;

    @GetMapping
    String getBranchListServices(@RequestParam("bankID") String id) throws InterruptedException {
        Common.getDelay();
        return branchListServices.getBranchListServices(id);
    }

}
