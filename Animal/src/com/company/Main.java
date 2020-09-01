package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Solution s = new Solution();
        System.out.println( s.isAnagram("aabb", "abab"));;
        */
        ListDemo demo = new ListDemo();
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        // List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        demo.test(l);
    }
}
