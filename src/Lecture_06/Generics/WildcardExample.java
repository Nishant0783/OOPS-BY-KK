package Lecture_06.Generics;

import java.util.*;


public class WildcardExample<T extends Number> {
    private Object[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample() {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
        // do something
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list3 = new WildcardExample<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);

//        WildcardExample<String> list4 = new WildcardExample<>();
        // Above line is an error because "WildcardExample" is only allowed to take type Number or subclass of
        // Number but we are passing String.

    }
}

/*
Q) What are wildcards?
ANS) Wildcards in JAVA generics provide a flexible way to work with generic types when you don't need to know exact
type parameter. Wildcards allows us to write more general and reusable code.

Q) How many types of wildcards are there in JAVA?
ANS) There are mainly three types of wildcards in JAVA:
i) Unbounded wildcard('?')
ii) Wildcard with an upperbound ('? extends T')
iii) Wildcard with lower bound ('? super T')

In this file we will learn only about 2nd type which is "Wildcard with an upperbound('? extends T')".

Q) What is wildcard with an upperbound?
ANS) A wildcard with an upperbound in JAVA generics is used to specify that a parameterized type or its subtypes
are accepted. It allows us to work with a range of types up to and including the specified upper bound 'T'.
for eg: If we write "<? extends Number>", it means "?" can be replaced with any subclass of Number class such as
Integer or Float and can include Number class also.

--> This type of wildcard is used for read-only purpose. (The reason we will get to know when we go deep in
Wildcards topic)

*/