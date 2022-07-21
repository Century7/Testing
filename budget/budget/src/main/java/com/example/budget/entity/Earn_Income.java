package com.example.budget.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Earn_Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer income_id;

    private Float amount;

    private String title;

    private String description;

    private String category;

    private Date date;




}
