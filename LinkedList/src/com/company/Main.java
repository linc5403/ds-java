package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        MyLinkedList l = new MyLinkedList();
        for (int i = 0; i < 10; i++)
            l.add(i, i);
        l.print();
    }
}
