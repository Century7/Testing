package com.example.budget.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answer_id;

    @Column(unique = true)
    private Integer question_id;

    private Integer user_id;

    private String title;

    private String description;

    private Date date;



}
