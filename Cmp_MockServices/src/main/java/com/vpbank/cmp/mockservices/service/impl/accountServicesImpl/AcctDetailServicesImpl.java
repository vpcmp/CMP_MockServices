package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.vpbank.cmp.mockservices.config.AccountBalancesConfig;
import com.vpbank.cmp.mockservices.config.AccountBalancesConfig.AccountBalance;
import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.entity.AccountDetailEntity;
import com.vpbank.cmp.mockservices.repository.AccountDetailRepository;
import com.vpbank.cmp.mockservices.service.accountServices.AcctDetailServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Log4j2
@RequiredArgsConstructor
public class AcctDetailServicesImpl implements AcctDetailServices {
    private final AccountBalancesConfig accountBalancesConfig;
    private final AccountDetailRepository accountDetailRepository;

    @Override
    @LogExecutionTime
    public String getAcctDetailServices(String accountNumber) {
        AccountDetailEntity accountDetailEntity = accountDetailRepository.findByAccountNumber(accountNumber);
        return accountDetailEntity.getDetail();
    }

    @Override
    public String getAccountBalances(String id) {
        try {
            List<AccountBalance> accountBalances = accountBalancesConfig.getAccountBalances();
            AccountBalance accountBalance = accountBalances.stream()
                    .filter(balance -> balance.getAccountNumber().equals(id))
                    .findFirst()
                    .orElse(new AccountBalance());
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            return ow.writeValueAsString(accountBalance);
        } catch (Exception ex) {
            log.error("Exception", ex);
        }
        return "";
    }

}
