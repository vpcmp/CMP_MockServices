//Account Summary Interface
package com.vpbank.cmp.mockservices.controller.accountServicesController;

import com.vpbank.cmp.mockservices.service.accountServices.AcctDetailServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cas/cashs/1.0/accounts/ca")
@RequiredArgsConstructor
public class AcctDetailController {

    private final AcctDetailServices acctDetailServices;

    @GetMapping
    String getAcctDetailServices(@RequestParam("id") String id) {
        return acctDetailServices.getAcctDetailServices(id);
    }

}
