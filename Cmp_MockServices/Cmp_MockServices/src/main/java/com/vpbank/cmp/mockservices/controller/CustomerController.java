package com.vpbank.cmp.mockservices.controller;

import com.vpbank.cmp.mockservices.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    String getCustomerInfo(@RequestParam("cif") String cif) {
        return customerService.getCustomerInfo(cif);
    }
}
