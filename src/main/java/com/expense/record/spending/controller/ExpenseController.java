package com.expense.record.spending.controller;

import java.util.Optional;

import com.expense.record.spending.model.Expense;
import com.expense.record.spending.service.ExpenseService

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/expenses")
@CrossOrigin("*")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;

	@GetMapping()
	public List<Expense> findAll() {
		return expenseService.findAll();
	}

}
