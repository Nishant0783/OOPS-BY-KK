package Lecture_05.AbstractClass;

// Here I will write some points related to abstract class
public abstract class Parent {
    String childName;
    /*
    POINT 1) In a class if there is a method which is abstract then the class should be marked "abstract".
    POINT 2) "abstract" methods can't have a body. They are implemented in child class.
    */
    public abstract void carrer();

    /*
    POINT 3) "abstract" keyword can't be used with variables.
    */
//  abstract int age;  --> Error, as we are using "abstract" with variable.

    /*
    POINT 4) An "abstract" method can't be "static".
    ---> Because "static" methods can't be overridden but "abstract" methods needs to get overridden. So, both
    are opposite of each other.

    POINT 5) An "abstract" class can't be "static".
    ---> Because "static" class needs no object to work, but "abstract" class needs object of child class to work.

    POINT 6) An "abstract" class can't be "final".
    ---> Because "final" cannot be inherited but inheritance is key for abstraction.

    POINT 7) An "abstract" method can't be "final".
    ---> Because "final" methods needs to have implementation but "abstract" methods can't have implementation
    in class in which they are declared.
    */

    /*
    POINT 8) We can have a "static" and just a normal method inside an "abstract" class.
     */

    public void staticMethod() {
        System.out.println("This is static method inside Abstract class");
    }    public void normalMethod() {
        System.out.println("This is normal method inside Abstract class");
    }


    /*
    POINT 9) An "abstract" class can have constructor but can't be instantiated.
    ---> An "abstract" class cannot be instantiated because if we instantiate an abstract class then we will
    have access to abstract method of class which are not implemented, and we can call them, but they cannot do
    anything so, which will be a drawback.
    */
    Parent(String childName) {
        this.childName = childName;
    }
}
