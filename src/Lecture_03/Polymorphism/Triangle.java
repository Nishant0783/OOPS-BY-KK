package Lecture_03.Polymorphism;

public class Triangle extends Shapes {
    void area() {
        System.out.println("Area is 0.5 * b * h");
    }

    void area(int b, int h) {
        System.out.println("The area of triangle is: " + 0.5*b*h);
    }

    void area(double b, double h) {
        System.out.println("The area of triangle with sides of double type is: " + 0.5*b*h);
    }
}
