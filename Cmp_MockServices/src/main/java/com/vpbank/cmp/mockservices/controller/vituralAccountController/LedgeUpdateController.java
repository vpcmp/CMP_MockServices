package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.LedgeUpdate;
import com.vpbank.cmp.mockservices.service.Common;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.LedgeUpdateServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/ledge/update")
@RequiredArgsConstructor
public class LedgeUpdateController {

    private final LedgeUpdateServices ledgeUpdateServices;

    @PutMapping
    String ledgeUpdate(@ModelAttribute LedgeUpdate ledgeUpdate) throws InterruptedException {
        Common.Delay();
        return ledgeUpdateServices.ledgeUpdateServices();

    };

}
