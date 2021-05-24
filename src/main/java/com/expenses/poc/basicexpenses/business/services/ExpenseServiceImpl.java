package com.expenses.poc.basicexpenses.business.services;

import com.expenses.poc.basicexpenses.business.interfaces.ExpenseService;
import com.expenses.poc.basicexpenses.domain.dto.ExpenseDTO;
import com.expenses.poc.basicexpenses.domain.mappers.ExpenseMapper;
import com.expenses.poc.basicexpenses.repositories.ExpenseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    final Logger logger = LoggerFactory.getLogger(ExpenseServiceImpl.class);

    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(final ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public void createExpense(final ExpenseDTO expense) {
        expense.setId(UUID.randomUUID().toString());
        expenseRepository.save(ExpenseMapper.INSTANCE.mapFromExpenseDTO(expense));
        logger.info("expense created");
    }

    @Override
    public List<ExpenseDTO> getAllExpenses() {
        logger.info("retrieving all expenses");
        return ExpenseMapper.INSTANCE.mapToExpenseDtoList(expenseRepository.findAll());
    }

    @Override
    public ExpenseDTO getExpenseById(String expenseId) {
        logger.info("getting expense by id");
        return ExpenseMapper.INSTANCE.mapToExpenseDTO(expenseRepository.findById(expenseId).orElse(null));
    }

    @Override
    public void deleteExpense(String expenseId) {
        logger.info("expense deleted");
        expenseRepository.deleteById(expenseId);
    }
}
