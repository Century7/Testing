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
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proupId;

    private String name;

    private String description;

    private Boolean isPublic;

    @Column(unique = true)
    private Date endDate;




}
