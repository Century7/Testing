package com.example.budget.repository;

import com.example.budget.entity.Budget_Plan_Duration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Budget_Plan_DurationRepository extends JpaRepository<Budget_Plan_Duration, Integer> {
}