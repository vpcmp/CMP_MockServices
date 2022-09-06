package com.vpbank.cmp.mockservices.controller.vituralAccountController;

import com.vpbank.cmp.mockservices.model.Notification;
import com.vpbank.cmp.mockservices.model.Validation;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.NotificationServices;
import com.vpbank.cmp.mockservices.service.vituralAccountServices.ValidationServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/corporate/virtual-account/v1/virtual-account/cmp/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationServices notificationServices;

    @PostMapping
    String notificationservices(@ModelAttribute Notification notification) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 5000));
        return notificationServices.notificationServices();

    };

}
