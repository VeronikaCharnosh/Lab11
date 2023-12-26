package com.apps.ucu.task1;

import java.util.List;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder @ToString
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    @Singular("mark")
    private List<Integer> grades;
}