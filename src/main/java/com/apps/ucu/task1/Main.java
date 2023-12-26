package com.apps.ucu.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Yuliia")
                                  .age(19)
                                  .mark(61)
                                  .grades(Arrays.asList(62, 64))
                                  .mark(100)
                                  .gender("f").build();
        System.out.println(user);
    } 
}