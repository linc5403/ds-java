package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // TreeNode* p = init();
        TreeNode r = new TreeNode(3);
        TreeNode r1 = new TreeNode(9);
        r.left = r1;
        r1 = new TreeNode(20);
        r.right = r1;
        TreeNode r2 = new TreeNode(15);
        r1.left = r2;
        TreeNode r3 = new TreeNode(7);
        r1.right = r3;
        // r.print();

        Solution s = new Solution();
        List<List<Integer>> result = s.levelOrderBottom(r);
        for (int i = 0; i < result.size(); i++) {
            List<Integer> currentLine = result.get(i);
            for (int j = 0; j < currentLine.size(); j++) {
                System.out.printf("%3d", currentLine.get(j));
            }
            System.out.println();
        }
    }
}
