package com.vpbank.cmp.mockservices.service.impl.accountServicesImpl;


import com.vpbank.cmp.mockservices.config.LogExecutionTime;
import com.vpbank.cmp.mockservices.entity.AccountSummaryEntity;
import com.vpbank.cmp.mockservices.repository.AccountSummaryRepository;
import com.vpbank.cmp.mockservices.service.accountServices.AcctSummaryServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AcctSummaryServicesImpl implements AcctSummaryServices {

    private final AccountSummaryRepository accountSummaryRepository;

    @Override
    @LogExecutionTime
    public String getAcctSummaryServices(String cif) {
        AccountSummaryEntity accountSummaryEntity = accountSummaryRepository.findByCif(cif);
        return accountSummaryEntity.getAccountSummary();
    }

}
