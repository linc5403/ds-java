package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // ArrayList<Integer> a;
        MyArrayList l = new MyArrayList();
        System.out.println(l.capacity);

        for (int i = 0; i < 100; i++)
            l.add(i, 100-i);
        System.out.println();

        for(Integer i : l.data)
            System.out.print(" " + i);

        System.out.println();

        System.out.println(l.remove(1000));

        System.out.println(l.remove(0));

        for(Integer i : l.data)
            System.out.print(" " + i);

        System.out.println();

        System.out.println(l.remove(4));

        for(Integer i : l.data)
            System.out.print(" " + i);

    }
}
