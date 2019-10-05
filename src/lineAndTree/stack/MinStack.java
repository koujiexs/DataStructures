package lineAndTree.stack;

import java.util.Arrays;

public class MinStack {

    private int[] data;
    private int size;
    /** initialize your data structure here. */
    public MinStack() {
        data=new int[10];
        size=0;
    }

    public void push(int x) {
        if(size==data.length){
            resize(2*size);
        }
        data[size]=x;
        size++;
    }

    public void pop() {
        size--;
    }

    public int top() {
        return data[size-1];
    }

    public int getMin() {
        int min=data[0];
        for (int i = 0; i <size ; i++) {
            if (min>data[i])
                min=data[i];
        }
        return min;
    }
    private void resize(int capacity){
       data = Arrays.copyOf(data,capacity);
    }
}
