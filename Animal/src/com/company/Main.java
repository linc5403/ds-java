package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal a = new Animal("大毛");
        System.out.println(a.name);
        Animal b = new Animal("小毛", 3);
        System.out.println(b.name);
        Animal c = new Animal();

        a.eat();
        b.eat();
        c.eat();
    }
}
