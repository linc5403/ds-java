package com.company;

public class MyLinkedList {
    class Node {
        Integer data;
        Node next;
    }

    int size;
    Node head;
    
    MyLinkedList() {
        head = null;
        size = 0;
    }

    Node get(int index) {
        Node t = head;
        while(index > 0) {
            t = t.next;
            index--;
        }
        return t;
    }

    Integer getFirst() {
        Node p = get(0);
        return p.data;
    }

    Integer getLast() {
        Node p = get(size-1);
        return p.data;
    }

    void print() {
        Node t = head;
        while(t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    void add(int index, Integer value){
        if (index > size || index < 0) {
            // 超出链表的边界
            System.out.println("index " + index + " out of bound " + size);
        } else {
            // 在index之前的一个节点插入
            Node newNode = new Node();
            newNode.data = value;
            if (index == 0) {
                // 新节点为头结点
                newNode.next = head;
                head = newNode;
            } else {
                // 1. 找到前驱节点
                Node pre = get(index-1);
                // 2. newNode.next = pre.next;
                newNode.next = pre.next;
                // 3. pre.next = newNode;
                pre.next = newNode;
            }
            size++;
        }
    }

    void addFirst(Integer elem) {
        add(0, elem);
    }

    void addLast(Integer elem) {
        add(size, elem);
    }

    Integer remove(int index) {
        if (index < 0 || index > size) {
            // 超出链表的边界
            System.out.println("index " + index + " out of bound " + size);
            // 此处不规范，应当抛出异常
            return -1;
        } else {
            Integer r;
            if (index == 0) {
                r = head.data;
                head = head.next;
            } else {
                Node pre = get(index-1);
                r = pre.next.data;
                pre.next = pre.next.next;
            }
            size--;
            return r;
        }
    }

    Integer removeFirst() {
        return remove(0);
    }

    Integer removeLast() {
        return remove(size-1);
    }

    void push(Integer elem) {
        addFirst(elem);
    }

    Integer pop() {
        return removeFirst();
    }

    Integer peek() {
        return getFirst();
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(Integer elem) {
        addLast(elem);
    }

    Integer dequeue() {
        return removeFirst();
    }
}
