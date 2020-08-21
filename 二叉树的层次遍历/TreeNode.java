package com.company;


// Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }

    void printTree(TreeNode r) {
        if (r.left != null)
            printTree(r.left);

        System.out.printf("%3d", r.val);

        if (r.right != null)
            printTree(r.right);
    }

    void print() {
        printTree(this);
        System.out.println();
    }
}
