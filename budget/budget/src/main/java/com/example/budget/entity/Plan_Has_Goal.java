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
public class Plan_Has_Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer budgetPlanId;

    private Integer budgetGoalId;

    private Float amountSaved;

    private String description;

    @Column(unique = true)
    private Date endDate;




}
