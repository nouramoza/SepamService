package com.sepam.sepam.repository;

import com.sepam.sepam.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    String findByBankCode(Long bankCode);
}
