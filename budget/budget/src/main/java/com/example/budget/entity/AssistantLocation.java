package com.example.budget.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AssistantLocation {
    @Id
    private  String postal_code;


}
