package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.LedgeUpdate;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.LedgeUpdateServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/ledge/update")
@RequiredArgsConstructor
public class LedgeUpdateController {

    private final LedgeUpdateServices ledgeUpdateServices;

    @PostMapping
    String ledgeUpdate(@ModelAttribute LedgeUpdate ledgeUpdate) throws InterruptedException {
        Common.getDelay();
        return ledgeUpdateServices.ledgeUpdateServices();

    };

}
