package com.company;

public class Animal {
    // 数据
    String name;
    Integer age;

    //初始化
    Animal() {
        name = "旺财";
        age = 1;
    }

    Animal(String name) {
        this.name = name;
        this.age = 1;
    }

    Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // 行为
    void eat() {
        System.out.println(name + " eating " + age + " bowl");
    }

}
