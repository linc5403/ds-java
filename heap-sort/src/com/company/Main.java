package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Heap heap = new Heap();
        int [] data = new int[] {7, 1, 10, 4, 6, 9, 2, 11, 3, 5, 12, 8};
        for (int i: data) {
            heap.enqueue(i);
        }
        System.out.println( heap.toString() );
        for (int i = 0; i < data.length; i++) {
            data[i] = heap.dequeue();
        }
        System.out.println(Arrays.toString(data));

        /*
        Integer min;
        do {
            min = heap.dequeue();
            System.out.println(min);
        } while (min != null);
        */
    }
}
