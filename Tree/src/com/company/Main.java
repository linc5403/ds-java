package com.company;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(10);
        tree.insert(1);
        tree.print();

        System.out.println();
        Hashtable<Integer, Student> studentHashtable = new Hashtable<>();
        Student a = new Student(10, "zhangsan");
        Student b = new Student(21, "lisi");
        Student c = new Student(10, "wangwu");
        studentHashtable.put(a.id, a);
        studentHashtable.put(b.id, b);
        studentHashtable.put(c.id, c);
        studentHashtable.remove(10);
        Student x = studentHashtable.get(10);
        x.echo();

        System.out.println(studentHashtable.contains(5));
    }
}
