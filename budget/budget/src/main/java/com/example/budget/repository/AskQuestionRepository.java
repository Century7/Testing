package com.example.budget.repository;

import com.example.budget.entity.AskQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AskQuestionRepository extends JpaRepository<AskQuestion, Integer> {
}