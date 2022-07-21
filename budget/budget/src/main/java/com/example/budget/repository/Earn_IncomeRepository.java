package com.example.budget.repository;

import com.example.budget.entity.Earn_Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Earn_IncomeRepository extends JpaRepository<Earn_Income, Integer> {
}