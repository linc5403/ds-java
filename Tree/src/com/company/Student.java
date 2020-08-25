package com.company;

public class Student {
    Integer id;
    String name;

    Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    void echo() {
        System.out.println("id: " + id + " ; name: " + name);
    }
}
