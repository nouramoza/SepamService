package com.sepam.sepam.repository;

import com.sepam.sepam.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankRepository extends JpaRepository<BankEntity, Long> {

    Optional<BankEntity> findByBankCode(Long bankCode);
}
