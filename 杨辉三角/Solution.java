package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        if (numRows <= 0)
            return r;

        List<Integer> line0 = new ArrayList<>();
        line0.add(1);
        r.add(line0);

        for (int i = 1; i < numRows; i++) {
            // 将1放到这一行的0号位置
            List<Integer> line = new ArrayList<>();
            line.add(1);
            // 获取i-1行
            List<Integer> linePre = r.get(i-1);
            // 遍历第i-1行，计算出结果，放到第i行的最后
            for (int j = 0; j < linePre.size()-1; j++) {
                line.add(linePre.get(j) + linePre.get(j+1));
            }
            line.add(1);
            r.add(line);
        }

        return r;
    }
}