package com.expenses.poc.basicexpenses.rest;

import com.expenses.poc.basicexpenses.business.interfaces.ExpenseService;
import com.expenses.poc.basicexpenses.domain.dto.ExpenseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/expenses")
public class ExpensesController {

    private final ExpenseService expenseService;

    public ExpensesController(final ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ExpenseDTO> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @PostMapping()
    public String createExpense(@RequestBody final ExpenseDTO expense) {
        expenseService.createExpense(expense);
        return HttpStatus.CREATED.toString();
    }

    @GetMapping(value = "/{expenseId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ExpenseDTO findExpenseById(@PathVariable("expenseId") final String expenseId){
        return expenseService.getExpenseById(expenseId);
    }

    @DeleteMapping("/{expenseId}")
    public String deleteExpenseById(@PathVariable("expenseId") final String expenseId){
        expenseService.deleteExpense(expenseId);
        return HttpStatus.OK.toString();
    }

}
