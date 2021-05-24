package com.expenses.poc.basicexpenses.business.interfaces;

import com.expenses.poc.basicexpenses.domain.dto.ExpenseDTO;

import java.util.List;

public interface ExpenseService {

    void createExpense(final ExpenseDTO expense);

    List<ExpenseDTO> getAllExpenses();

    ExpenseDTO getExpenseById(final String expenseId);

    void deleteExpense(final String expenseId);
}
