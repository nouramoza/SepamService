package com.sepam.sepam.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import com.sepam.sepam.entity.BankEntity;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BankCrudTest {

    BankRepository bankRepository;

    @Test
    void saveTest() {
        BankEntity bank = new BankEntity();
        bank.setBankName("Markazi");
        bank.setBankCode(1111L);
        bank.setIsActive(true);

        bankRepository.save(bank);

        assertThat(bankRepository.findByBankCode(1111L).get().getBankName().equals("Markazi"));
    }

}
