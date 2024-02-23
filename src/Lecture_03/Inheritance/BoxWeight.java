package Lecture_03.Inheritance;

public class BoxWeight extends Box{
    float weight;
    int mass; /* This is just for showing use of "super" keyword. */
    BoxWeight() {
        System.out.println("This is constructor of BoxWeight class which is child class of Box class but parent class of BoxPrice class.");
    }
    BoxWeight(float weight) {
        this.weight = weight;
    }

    BoxWeight(int mass) {
        this.mass = mass;
        System.out.println("Constructor called through super keyword from BoxPrice class");
    }

    /*
    We can make constructor to call the constructor of "Box" class here.
     */
    BoxWeight(double l, double b, float weight) {
        super(l, b);
        this.weight = weight;
    }
}
