package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer.reverse(100);
        MyHashTable table = new MyHashTable();
        Student a = new Student(10, "zhangsan");
        Student b = new Student(21, "lisi");
        table.put(a);
        table.put(b);
        Student x = table.get(10);
        x.name = "wangwu";
        table.get(10).echo();
        // Student x = table.remove(10);
        // x.echo();
        // Student y = table.get(10);
        // System.out.println(y);

        /*
        HashSet<Student> setM = new HashSet<>();
        setM.add(a);
        setM.add(b);
        setM.remove(a);
        Student [] as = setM.toArray(new Student[0]);
        for (int i = 0; i < as.length; i++) {
            as[i].echo();
        }

         */
    }
}
