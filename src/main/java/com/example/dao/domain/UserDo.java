package com.example.dao.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserDo {

    private Long id;
    private String username;
    private String name;
    private Integer age;
    private BigDecimal balance;
}
