package com.company;

public class Tree {
    class Node {
        Integer data;
        Node l;
        Node r;

        Node(Integer data) {
            this.data = data;
            l = r = null;
        }
    }

    // 数据，成员
    Node root;

    // 动作，method，方法
    Tree() {
        root = null;
    }

    void middlePrint(Node p) {
        if (p.l != null)
            middlePrint(p.l);
        System.out.print(p.data + " ");
        if (p.r != null)
            middlePrint(p.r);
    }

    void print() {
        middlePrint(root);
    }

    void insert(Integer elem) {
        Node node = new Node(elem);
        if (root == null) {
            // 当前为空树，插入第一个节点
            root = node;
            return;
        }

        Node p = root;

        // 找到了p
        while(true) {
            if (p.data < elem) {
                if (p.r == null) {
                    p.r = node;
                    break;
                }
                else
                    p = p.r;
            } else {
                // 不处理p节点data == elem的情况
                if (p.l == null) {
                    p.l = node;
                    break;
                }
                else
                    p = p.l;
            }
        }
    }
}
