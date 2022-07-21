package com.example.budget.repository;

import com.example.budget.entity.Plan_Has_Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Plan_Has_GoalRepository extends JpaRepository<Plan_Has_Goal, Integer> {
}