package com.company;

public class MyHashTable {
    class Node {
        Student data;
        Node next;

        Node(Student s) {
            data = s;
        }
    }

    Node [] table;

    MyHashTable() {
        table = new Node[11];
    }

    void put(Student s) {
        // 1. 根据s的id找到table对应的链表
        // 2. 把s放到链头部
        // 3. table[index] = newNode;
    }

    Student get(Integer id) {
        // id->index
        // 遍历这个链表，查找有无对应的id
        return null;
    }
}
