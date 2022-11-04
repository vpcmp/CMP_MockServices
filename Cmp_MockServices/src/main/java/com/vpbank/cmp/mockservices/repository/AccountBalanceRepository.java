package com.vpbank.cmp.mockservices.repository;

import com.vpbank.cmp.mockservices.entity.AccountBalanceEntity;
import com.vpbank.cmp.mockservices.entity.AccountDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountBalanceRepository extends JpaRepository<AccountBalanceEntity, String> {
    AccountBalanceEntity findByAccountNumberBalance(String accountNumberBalance);
}
