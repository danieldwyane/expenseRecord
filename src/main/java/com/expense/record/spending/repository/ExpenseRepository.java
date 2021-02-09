package com.expense.record.spending.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.record.spending.model.Expense;



public interface ExpenseRepository extends JpaRepository<Expense, Long>{
}
