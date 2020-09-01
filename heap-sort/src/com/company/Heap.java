package com.company;

import java.util.Arrays;

/*
最小堆
 */
public class Heap {
    Integer [] data;
    int capacity;
    int length;

    Heap() {
        capacity = 20;
        data = new Integer[capacity];
        length = 0;
    }

    boolean enqueue(Integer elem) {
        if (length >= 20) {
            System.out.println("Heap's capacity is " + capacity + " , enqueue failed");
            return false;
        }

        // 1. 新的数据放到最后
        data[length] = elem;
        // 2. 和父节点比较，比父节点小则交换，直到移动到0位置或是大于等于父节点
        int curr = length;
        int father = (curr-1)/2;
        while (data[curr] < data[father]) {
            // 交换
            Integer t = data[curr];
            data[curr] = data[father];
            data[father] = t;
            curr = father;
            father = (curr-1) / 2;
        }
        length++;
        return true;
    }

    Integer dequeue() {
        if (length == 0)
            return null;
        // 1. 最小值一定是0位置
        Integer min = data[0];
        // 2. 把最后的元素放到0号位置
        data[0] = data[length-1];
        length--;
        // 3. a[curr] 和它的小的那个子节点比较，如果curr>这个子节点，就和子节点交换
        int curr = 0;
        int left = curr;
        int right = curr;

        if ( 2 * curr + 1 < length)
            left = 2 * curr + 1;
        if ( 2* curr + 2 < length)
            right = 2 * (curr+1);
        int minChild = data[left] < data[right] ? left:right;

        while (data[curr] > data[minChild]) {
            Integer t = data[curr];
            data[curr] = data[minChild];
            data[minChild] = t;
            curr = minChild;
            if ( 2 * curr + 1 < length)
                left = 2 * curr + 1;
            else
                left = curr;
            if ( 2* curr + 2 < length)
                right = 2 * (curr+1);
            else
                right = curr;

            minChild = data[left] < data[right] ? left:right;
        }

        return min;
    }

    @Override
    public String toString() {
        return "Heap{" +
                "data=" + Arrays.toString(data) +
                ", capacity=" + capacity +
                ", length=" + length +
                '}';
    }
}
