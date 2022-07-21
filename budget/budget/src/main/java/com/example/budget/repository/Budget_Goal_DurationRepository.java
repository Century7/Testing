package com.example.budget.repository;

import com.example.budget.entity.Budget_Goal_Duration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Budget_Goal_DurationRepository extends JpaRepository<Budget_Goal_Duration, Integer> {
}