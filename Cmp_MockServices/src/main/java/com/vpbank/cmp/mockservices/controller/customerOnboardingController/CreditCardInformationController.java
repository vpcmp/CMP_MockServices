//Customer On-Boarding - Credit Cards Information Interface
package com.vpbank.cmp.mockservices.controller.customerOnboardingController;


import com.vpbank.cmp.mockservices.service.customerOnboardingServices.CreditCardInformationServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cas/cashs/1.0/cards/list")
@RequiredArgsConstructor
public class CreditCardInformationController {

    private final CreditCardInformationServices creditCardInformationServices;

    @GetMapping
    String getCreditCardInformationServices(@RequestParam("id") String id) {
        return creditCardInformationServices.getCreditCardInformationServices(id);
    }


}
