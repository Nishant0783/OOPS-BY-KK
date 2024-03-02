package Lecture_05.Interfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.eyes();
        c.hairs();
        c.height();
        c.strength();
        c.fatherOccupation();
        c.motherOccupation();
        c.love();

        /*
        We can also use interfaces as reference types.
         */
        Father f = new Child();
        // Since "f" has reference type of "Father" so we cannot access the methods which are related to "Mother"
        // or the members of "Child" class.
        f.fatherOccupation();
        f.love();
//      f.eyes(); Error, as "eyes()" is specific to mother.


        Mother m = new Child();
        // Since "m" has reference type of "Mother" so we cannot access the methods which are related to "Mother"
        // or the members of "Child" class.
//      m.fatherOccupation(); Error, as "fatherOccupation()" is specific to father.
        m.love();
        m.eyes();




//     Child.fatherName(); Error, Static method can only be accessed by Father interface
//     Child.motherName(); Error, Static method can only be accessed by Mother interface


        // Exploration purpose
        Son s = new Son("Beta");
        s.fatherOccupation();
        s.motherOccupation();
        s.love();
        s.eyes();
        s.hairs();
//      Son.fatherName(); Static method can only be accessed by Father interface.
//      Son.motherName(); Static method can only be accessed by Mother interface.


    }
}


/*
Q) Why do we need Interfaces?
---> In java, we know that we cannot have multiple inheritance means in java, a child class cannot extend two
parent classes.

Q) Why can't we have multiple inheritance?
---> Suppose we have two parent classes A and B, and a child class C. Class A has a method with name "run()" and
class B also have a method with name "run()". Now, lets say C extends both A and B. We created an object of class
C with name "obj" and we called "run()" method on that object. So, how java will determine which method to call
because both parent class has "run()" method.

Q) How we will understand interfaces here?
---> Till now in inheritance we have learnt that when child inherits the properties of parent it is inheritance.
Here, to understand interface we will take an example:
EXAMPLE: Suppose a child wants to have hair and eyes like mother but strength and height like father. So, child
needs to have properties from two different classes which is "Mother and Father". But this is not possible in java
as a single class extending two classes. So, instead to declaring "Mother and Father" as class, we will declare
them as interface and child will implement those interfaces.
*/