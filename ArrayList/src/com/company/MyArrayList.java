package com.company;

public class MyArrayList {
    int capacity; // 当前这个对象的容量
    int length; // 当前list最后可以放入的位置
    Integer [] data;

    MyArrayList() {
        this.capacity = 10;
        this.length = 0;
        this.data = new Integer[capacity];
    }

    // int remove(int index); 无法用int的返回值来表示删除是否成功
    Integer remove(int index) {
        if (index >= length)
            return null;
        Integer r = data[index];
        System.arraycopy(data, index+1, data, index, length-index-1);
        length--;
        return r;
    }

    void add(int value) {
        // 将value放到当前这个list的最后
        add(length, value);
    }

    void add(int index, int value) {
        if (length == capacity) { // 当前队列已经满了，需要扩容
            Integer [] newData = new Integer[capacity << 1];
            for (int i = 0; i < capacity; i++)
                newData[i] = data[i];
            data = newData; // 该对象的data部分使用newData来替代
            capacity <<= 1;
            add(index, value);
        } else {
            for (int i = length; i > index; i--) {
                data[i] = data[i-1];
            }
            data[index] = value;
            length++;
        }
    }
}
