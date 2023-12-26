package com.apps.ucu.task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Client {
    private static int idCounter = 0;
    private int id;
    private String name;
    private int age;
    private String sex;

    public Client(String nam, int years, String gender) {
        this.id = idCounter++;
        this.name = nam;
        this.age = years;
        this.sex = gender;
    }
}