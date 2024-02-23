package Lecture_03.Inheritance;

public class Box {
    double l;
    double b;
    double h;

    String parentClass;
    String ownerName;
    // The above two members are only for seeing the parent class of Box class.
// Default constructor
    Box () {
        System.out.println("This is constructor of Box class which is parent class of BoxWeight class.");
    }

//  Constructor to create cuboid.
    Box (double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

//  Constructor to create cube.
    Box (double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

//  Copy constructor - This is a constructor which is used to initialise an object with any older object value.
    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.b = old.b;
    }

//  Constructor used to implement "super" keyword.
    Box(double l, double b) {
        this.l = l;
        this.b = b;
        System.out.println("Constructor of Box class called using super keyword");
    }

//    Constructor call parent class of Box class
    Box(String ownerName) {
        String parentClassName = this.getClass().getSuperclass().getName(); // This is how we get the name of a parent class of any
        // child class

        this.ownerName = ownerName;
        this.parentClass = parentClassName;

//      super(); This line is error because "super()" must be called first in the subclass constructor because
//      parent class constructor might have initialisation logic.
        System.out.println("The owner of this code is: " + ownerName + " who is trying to print the name of parent" +
                " class of Box Class which is: " + parentClassName + " class.");

    }



}
