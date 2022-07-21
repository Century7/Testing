package com.example.budget.repository;

import com.example.budget.entity.Budget_Assistant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Budget_AssistantRepository extends JpaRepository<Budget_Assistant, Integer> {
}