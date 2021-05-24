package com.expenses.poc.basicexpenses.domain.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExpenseDTO {

    private String id;
    private BigDecimal value;
    private String description;
    private String category;

}
