package com.example.budget.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Member_Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String postal_code;

    private String country;

}
