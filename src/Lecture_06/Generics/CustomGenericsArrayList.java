package Lecture_06.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericsArrayList<T> {
  /*
  1) Since internally Arraylist uses array. So here we will use array and that will be of type "T".
  */
//  private <T> data[]; Syntax is wrong. We can't use Type parameter with diamond bracket while declaring type of
//  variable.

//  private T datas[]; // this is correct syntax
    /*
    After compilation, since T is not bounded to any Class. So, T will be converted to "Object".
    When we see actual internal implementation of ArrayList then, we can find that they have used "Object"
    directly.
    */
    // More preferred syntax is:
    private Object data[];
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList() {
        this.data = new Object[DEFAULT_SIZE];
//      this.datas = new T[DEFAULT_SIZE];

        /*
        Why above line is an error?
        This is because here we are creating an array "datas" of size "DEFAULT_SIZE" which is an object. So,
        internally we are instantiating Array class with an object of Type "T". Now, the problem here is object
        creation using "new" keyword happens at runtime and at runtime Java does not know about "T" because of
        Type erasure. That's why it gives error "Type parameter 'T' cannot be instantiated directly"
        */

//      this.datas = new Object[DEFAULT_SIZE];

        /*
        Why above line is error?
        This is because datas is of type "T" and we are creating object of class "Object" which is parent class.
        So, what is happening here is the reference is of child class and constructor is of parent class which is
        not allowed in java. So, either this will be an error or we have to downcast it to "T" class, like this:
        "this.datas = (T[]) new Object[DEFAULT_SIZE];".

        ---DOUBT--- When we downcast, then we have give only the name of class so here, why are we giving "(T[])"
        instead of giving only "T", The reason is datas is an array and, it's datatype is not "T", the actual
        datatype of datas is "array of values of T which is T[]".
        */

//      this.datas = (T[]) new Object[DEFAULT_SIZE]; // This is till now correct syntax
        // There is a problem which is, downcasting sometimes may show random behaviour. So, it is not advisable to
        // use downcasting.

        /*
        By keeping in mind all the above-mentioned problems and solutions we can say that the best way is to use
        "Object class" to declare any instance variable or method.
        That's why the way we declared "data[]" array is best.
         */
    }

    /*
    2) Now we will create a method to add elements to array list.
    */
    public void add(T num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }
    /*
    ----DOUBT---- Above while declaring array we have used Object as its datatype and also mentioned above that
    using "T" directly as datatype can cause many problems. So here why are we using "T" as datatype of "num"?
    ----ANS---- The explanation is that, since "Object" is root class so, using "Object" as datatype for "num"
    makes the "num" to store the value of any datatype which has a wrapper class. Now, just logically think that
    if we make an array of "Integer", and since we are using "Object" as a datatype of num so, it can be anything
    like "String" or "Boolean" so, how can add a "String" or "Boolean" value to "Integer" array.
    That's why we use "T" as datatype of "num" to maintain consistent types.

    ----While, creating "data" array we used "Object" because we wanted it to be of any datatype and later on
    that type is followed by whole class.
    */
    private boolean isFull() {
        return data.length == size;
    }

    public void resize() {
        Object temp[] = new Object[data.length * 2]; // The reason for this syntax is already discussed
        for(int i =0; i<data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        T removedValue = (T) data[--size];
        return removedValue;
    }
    /*
     "T removedValue = (T) data[--size];" Why are we type-casting the value of data[--size] to T?
     ANS) Due to type erasure, the information about "T" has been removed and, it is replaced by "Object".
     And also the data type for "data" array is "Object", so the value of "data[--size]" is also of type of
     "Object" that's why we are type casting to generic type "T" to make it consistent.
     */

    public T get(int index) {
        return (T)data[index]; // Same as above reason
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
        CustomGenericsArrayList<Integer> a = new CustomGenericsArrayList<>();
        a.add(5);
        a.add(10);
        System.out.println(a.get(0));

        CustomGenericsArrayList<String> b = new CustomGenericsArrayList<>();
        for(int i = 0; i<20; i++) {
            b.add("nishant");
        }

        System.out.println(b);

    }

}


/*
Before going into Generics we need to understand some things:
1) Diamond Operator: Represented by "<>", diamond operators are used when we create object of generic class or
interface. They are used to provide the type to the object of any generic class or interface. Before introduction
of diamond operator developers had to specify the type arguments both during the declaration of variable and in
constructor call, but in JAVA 7 when diamond operator was introduced developers had to specify the type only while
declaring the variable.
For eg: Before JAVA 7, "List<Integer> list = new ArrayList<Integer>();"
        After JAVA 7,  "List<Integer> list = new ArrayList<>();"

2) Type Parameter: A type parameter is a placeholder for a specific type that is used in definition of a generic
class, interface, or method. It allows us to create classes, interfaces, and methods that can work with different
data types while maintaining type safety at compile time.
Type parameter are represented by single uppercase letter, such as "T" for "type", "E" for "element", "K" for "key"
, "V" for "value". We can use valid java identifier as a type parameter.

3) Type parameter with bounds: It is just a simple type parameter but is bounded to a higher type. The higher type
should be a class.
For eg: Normal type parameter: "<T>"            Type parameter with bound: "<T extends Number>", this means that
                                                now "T" should be a subtype of "Number".
********If no bounds are defined then all the type parameter are bounded to Object class, as all the bounds are
classes which are subclass of Object class. So, when we don't give any type then it automatically takes Object
class.********

4) Type Erasure: Type erasure is a concept which is related to the way generics are implemented in java. It
refers to the process, by which information about generic type is removed at compile time and making actual type
inaccessible at runtime.
For eg: Suppose we have a class which uses type "T". We instantiated this class and provided that "T" will be
"String". So at compile time what java will do is, it will compile the program according to "String" and then will
remove "T" from the program and replace it with "Object" or "Bounded" class.
Before compilation:
------>  public class Box<T> { private T size; }
After compilation:
------> public class Box { private Object size; }
*/


/*
-------------------------------------------GENERICS IN JAVA------------------------------------------------------
As we have seen, when we made our own ArrayList we were able to create only one for one data type. To create
same ArrayList for another data type we have to write the same code and just change data type.
---> Generics is the way to do the above stuff more efficiently.
---> Generics were introduced in JAVA 5, which allows classes, interfaces and methods to work on different types
while maintaining type safety.
---> Generics make use of "Type Parameter" to get the dynamic types and use "Type Erasure" to maintain type safety.
*/