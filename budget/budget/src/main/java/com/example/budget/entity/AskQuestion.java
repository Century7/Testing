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
public class AskQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer question_id;

    private Integer user_id;

    private String title;

    private String description;

    private Date date;


}
