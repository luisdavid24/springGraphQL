package com.graphql.example.graphql;

import lombok.Data;

@Data
public class InputStudent {

    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String email;
    private String courseId;

}
