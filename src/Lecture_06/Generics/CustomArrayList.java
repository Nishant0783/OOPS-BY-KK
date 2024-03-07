package Lecture_06.Generics;

import java.util.ArrayList;
import java.util.Arrays;

// In this file we will create our own arraylist and try to see cons in that and solve them.
public class CustomArrayList {
    private int data[];
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        // Before adding an element we will check that if current arraylist is full then, we will make new one
        // with doubled size.
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull(){
        return data.length == size;
    }

    public void resize() {
        int temp[] = new int[data.length * 2];
        // copy all the elements from data array to temp array.
        for(int i = 0; i < data.length; i++) {
            data[i] = temp[i];
        }
        // Below line indicates that now the data variable is pointing to temp array and when we will come out of
        // this method then temp will be removed by garbage collector and data will be our working array.
        data = temp;
    }

    public int remove() {
        int removedvalue = data[--size]; // Actually, we are not deleting the value we are just reducing the size
        // of array so that the last value has no relation with array.
        return removedvalue;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        /*
        The main problem is, if we observe our original arraylist then we can create it of any type like Integer,
        String or of any class, the only type we cannot create it for is "primitive data types". But here I am
        only able to create the arraylist of int type.
        */

    }

}
