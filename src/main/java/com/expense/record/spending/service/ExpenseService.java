package com.expense.record.spending.service;

import java.util.Optional;

import com.expense.record.spending.model.Expense;
import com.expense.record.spending.repository.ExpenseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	public Optional<Expense> findAll() {
		return expenseRepository.findAll();
	}	
}