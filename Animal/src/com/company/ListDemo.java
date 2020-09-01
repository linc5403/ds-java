package com.company;

import java.util.List;

public class ListDemo {
    public void test(List<Integer> in) {
        // 遍历每个元素，并将其删除
        for (Integer i: in) {
            System.out.println(i);
            in.remove(i);
        }
    }
}
