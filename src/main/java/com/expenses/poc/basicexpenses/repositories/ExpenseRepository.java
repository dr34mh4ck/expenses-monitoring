package com.expenses.poc.basicexpenses.repositories;

import com.expenses.poc.basicexpenses.domain.entity.ExpenseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<ExpenseEntity, String> {


}
