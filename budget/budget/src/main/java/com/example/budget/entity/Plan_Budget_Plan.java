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
public class Plan_Budget_Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer budgetPlanId;

    private Integer userId;

    private String name;

    private String description;

    private Integer totalDuration;

    private Date startDate;

    private Date endDate;




}
