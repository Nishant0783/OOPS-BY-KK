package Lecture_05.AbstractClass;

public class Child extends Parent {
    Child(String childName) {
        super(childName);
    }

    @Override
    public void carrer() {
        System.out.println(childName + " will be an engineer.");
    }
    // Implemented abstract method here.
}


