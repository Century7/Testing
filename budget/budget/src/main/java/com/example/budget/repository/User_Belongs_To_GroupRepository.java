package com.example.budget.repository;

import com.example.budget.entity.User_Belongs_To_Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Belongs_To_GroupRepository extends JpaRepository<User_Belongs_To_Group, Integer> {
}