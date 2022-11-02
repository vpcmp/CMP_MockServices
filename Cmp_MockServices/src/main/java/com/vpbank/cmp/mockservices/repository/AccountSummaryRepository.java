package com.vpbank.cmp.mockservices.repository;

import com.vpbank.cmp.mockservices.entity.AccountSummaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountSummaryRepository extends JpaRepository<AccountSummaryEntity, String> {
    AccountSummaryEntity findByCif(String cif);
}
