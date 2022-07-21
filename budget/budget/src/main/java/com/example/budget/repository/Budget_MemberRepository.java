package com.example.budget.repository;

import com.example.budget.entity.Budget_Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Budget_MemberRepository extends JpaRepository<Budget_Member, Integer> {
}