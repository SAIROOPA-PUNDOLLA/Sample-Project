package com.example.Sample.project.Services;

import com.example.Sample.project.Models.Expense;
import com.example.Sample.project.Repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;
    public List<Expense> getAllexpenses(){
        return expenseRepository.findAll();
    }
    public void createExpense(Expense expense){
        expenseRepository.save(expense);
    }

    public Expense updateExpensesEntity(Expense expense) {
        return null;
    }

    public void deleteExpensesEntity(Long id) {

    }

    public Expense saveExpensesEntity(Expense expense) {
        return null;
    }

    public List<Expense> findAll() {
        return null;
    }
}