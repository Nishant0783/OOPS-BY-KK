package Lecture_03.Inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
//        Box b1 = new Box(); // This will initialise l, b, h with default values.
//        Box b2 = new Box(12, 1, 15); // This will be forming a cuboid.
//        Box b3 = new Box(60); // This will be forming a cube.
//        Box b4 = new Box(b2); // This will initialise "b4" with values of "b2" means will make it a cuboid.

        // Above stuff is just normal, previously studied concepts.

        /*
        POINT 1) Since, "BoxWeight" class is inheriting "Box" class so, it has access to all the members of "Box"
        class. But reverse is not possible.
        ----------> "A child class can have access to all public members of parent class. But a parent class has
        no access to child class members."
        */

//        BoxWeight bw1 = new BoxWeight(15.0f);
//        System.out.println(bw1.weight);
//        System.out.println(bw1.l + ", " + bw1.h + ", " + bw1.b);

//      System.out.println(b1.weight); This line is an error because "b1" is object of parent class and "weight"
//      is a member of child class. So, accessing the members of child class through the parent class is not
//      allowed in java.

        /*
        Above code proves POINT 1:
        */

        /*
        POINT 2) In the below code "b5" is a reference variable of "Box" class but for creating object we are
        using constructor of "BoxWeight" class. So, "b5" will not have access to "weight" because it is a member
        of child class.
        ----------> "Type of reference variable is used to determine what members can an object access. Constructors
        only provide default values to members but do not define what members an object can access."
        ----------> "In java it possible that the reference variable can be of parent class type and constructor can
        be from child class. But, vice-versa is not possible. The reason is that as from the above we know that
        reference variable type is used to determine the accessibility of members by object, and we know that
        parent class cannot access the members of child class. So, calling a constructor of parent class and
        referring object to child class will only initialise variable present in parent class which can lead to some
        un-initialised variable of child class. That's why vice-versa is not possible"
        */

//        Box b5 = new BoxWeight(78.0f);
//        System.out.println(b5.b + ", " + b5.h + ", " + b5.l);
//      System.out.println(b5.weight); // This line is error because we are trying to access member of child class
//      through the object of parent class. As "b5" has a reference type of "Box" class which is a parent class.
//      BoxWeight bw2 = new Box(); This line is an error because reference variable is of type child class and
//      constructor is from parent class.
        /*
        Above code proves POINT 2:
        */

        /*
        POINT 3) Here we are creating the object of "BoxPrice" class which is grand child of "Box" class, and we
        can notice that first the constructor of "Box" class is called which is grandparent of "BoxPrice" class
        then constructor of "BoxWeight" class is called which is parent of "BoxPrice" class.
        ----------> "In java, when we create an object of child class the first the constructor of parent class is
        called then for succeeding classes."
        */
//        BoxPrice bp1 = new BoxPrice();
//      The output of above line will print the content of Box() then BoxWeight() and then at last BoxPrice().
        /*
        Above code proves POINT 3:
        */

        /*
        POINT 4) --------> "In java, using "super" keyword we can call the constructor of parent class explicitly.
        Parent class means just the class above it. For eg: In "BoxPrice" class using "super" keyword we can call
        constructor of "BoxWeight" class not "Box" class.
        */
//        BoxPrice bp2 = new BoxPrice(15, 90);
        // We can analyse the output and see that content of constructor "Box(int mass) is printed.
        /*
        Above code proves POINT 4:
        */

//      Other example for analysing POINT 4:
        BoxWeight bw3 = new BoxWeight(12, 15, 90.6f);

        /*
        POINT 5) --------> "In java, "object" class is root class of all classes. There is no parent class of
        object class."
        We can prove this by calling super() in constructor of Box class which has not parent class defined explicitly.
        */
        Box b6 = new Box("Nishant Paliwal");
    }
}

/*
Q) What is Inheritance?
---> Inheritance is one of the four principles of OOPS. Inheritance allows a child class or subclass to
inherit properties of parent class or super class.
---> In java we can implement inheritance using "extends" keyword.
Eg: "class subclass extends superclass { // body of class }"
*/
