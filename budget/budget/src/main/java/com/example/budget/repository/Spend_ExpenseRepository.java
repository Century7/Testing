package com.example.budget.repository;

import com.example.budget.entity.Spend_Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Spend_ExpenseRepository extends JpaRepository<Spend_Expense, Integer> {
}