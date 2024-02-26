package Lecture_03.FinalAndStatic;

// Declaring this class as final will prevent its inheritance.
public final class FinalParent {
    final int a = 15;
    void someMethod() {
        System.out.println("This is a final class which can't be inherited.");
    }
}
