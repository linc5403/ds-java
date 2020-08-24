package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        for (int i = 0; i < 10; i++)
            l.push(i);
        while(!l.isEmpty())
            System.out.print(l.pop() + " ");
	    // write your code here
        /*
        MyLinkedList l = new MyLinkedList();
        for (int i = 0; i < 10; i++)
            l.add(0, i);
        l.addFirst(100);
        l.addLast(1000);
        l.print();
        MyLinkedList l1 = l;
        System.out.println();
         */
    }
}
