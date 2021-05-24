package com.expenses.poc.basicexpenses.domain.mappers;

import com.expenses.poc.basicexpenses.domain.dto.ExpenseDTO;
import com.expenses.poc.basicexpenses.domain.entity.ExpenseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class ExpenseMapper {

      public static final ExpenseMapper INSTANCE =
            Mappers.getMapper(ExpenseMapper.class);

    public abstract ExpenseDTO mapToExpenseDTO(final ExpenseEntity expenseEntity);

    public abstract ExpenseEntity mapFromExpenseDTO(final ExpenseDTO expenseDTO);

    public abstract List<ExpenseDTO> mapToExpenseDtoList(final List<ExpenseEntity> expenseEntities);
}
