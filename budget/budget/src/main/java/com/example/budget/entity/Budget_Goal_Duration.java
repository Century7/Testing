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
public class Budget_Goal_Duration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer totalDuration;

    @Column(unique = true)
    private Date startDate;

    @Column(unique = true)
    private Date endDate;




}
