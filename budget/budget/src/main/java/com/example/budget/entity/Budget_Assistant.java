package com.example.budget.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Budget_Assistant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(unique = true,nullable = false)
    private String username;

    @Column(unique = true,nullable = false)
    private String email;

    private String password;

    private String first_name;

    private String last_name;

    private String area_of_expertise;

    private String postal_code;

    private Integer years_of_experience;

}
