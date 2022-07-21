package com.example.budget.repository;

import com.example.budget.entity.Set_Budget_Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Set_Budget_GoalRepository extends JpaRepository<Set_Budget_Goal, Integer> {
}