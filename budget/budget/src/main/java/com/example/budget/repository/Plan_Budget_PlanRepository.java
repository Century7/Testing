package com.example.budget.repository;

import com.example.budget.entity.Plan_Budget_Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Plan_Budget_PlanRepository extends JpaRepository<Plan_Budget_Plan, Integer> {
}