package com.graphql.example.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;
    private Integer age;
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Course.class)
    private Course course;
}
