package com.expenses.poc.basicexpenses.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Document("Expense")
public class ExpenseEntity implements Serializable {

    private static final long serialVersionUID = -4008253909004267874L;

    @Id
    private String id;

    private BigDecimal value;
    private String description;

    @Indexed(name = "expenseCategory")
    private String category;
}
