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
        // 1. 根据s的id找到table对应的index
        int index = s.id % table.length;
        // 2. 把s放到链头部
        Node head = table[index];
        Node newNode = new Node(s);
        newNode.next = head;
        // 3. table[index] = newNode;
        table[index] = newNode;
    }

    Student get(Integer id) {
        // id->index
        int index = id % table.length;
        Node p = table[index];
        while(p != null) {
            if (p.data.id == id)
                return p.data;
            p = p.next;
        }
        // 遍历这个链表，查找有无对应的id
        return null;
    }

    Student remove(Integer id) {
        int index = id % table.length;
        Node p = table[index];
        if (p == null)
            return null;

        if (p.data.id == id) {
            table[index] = p.next;
            return p.data;
        } else {
            Node pre = p;
            while (pre.next != null && pre.next.data.id != id)
                pre = pre.next;
            if (pre.next == null)
                return null;
            else {
                p = pre.next;
                pre.next = pre.next.next;
                return p.data;
            }
        }
    }
}
