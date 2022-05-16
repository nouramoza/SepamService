package com.sepam.sepam.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "BANK")
@Data
public class BankEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "BANK_NAME", nullable=false, unique = true)
    private String bankName;

    @Column(name = "BANK_CODE", nullable=false, unique = true)
    private Long bankCode;

    @Column(name = "ADDRESS", nullable=false, unique = true)
    private String address;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

}
