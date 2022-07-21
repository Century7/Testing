package com.example.budget.repository;

import com.example.budget.entity.Member_Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Member_LocationRepository extends JpaRepository<Member_Location, String> {
}