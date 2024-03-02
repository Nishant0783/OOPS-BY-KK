package Lecture_05.NestedInterfaces;

public class A {
    public interface B {
        default void isOdd(int num) {
            System.out.println(((num & 1) == 0) ? "true" : "false");
        }
    }
}


/*
POINT 1) A nested interface cannot be "default"
*/