package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.entity.AccountBalanceEntity;
import com.vpbank.cmp.mockservices.repository.AccountBalanceRepository;
import com.vpbank.cmp.mockservices.service.accountServices.AcctBalanceServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@Service
@Log4j2
@RequiredArgsConstructor
public class AcctBalanceServicesImpl implements AcctBalanceServices {
    private final AccountBalanceRepository accountBalanceRepository;

    @Override
    @LogExecutionTime
    public String getAcctBalanceServices(String accountNumberBalance) {
        AccountBalanceEntity accountBalanceEntity = accountBalanceRepository.findByAccountNumberBalance(accountNumberBalance);
        return accountBalanceEntity.getDetailBalance();
    }



}
