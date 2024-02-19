package Lecture_02;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // Till above, we have declared all the instance variables means teh variables which depends upon object.
    // Like, for obj1 name, age and other things will be different from obj2.
    /*
    But what if, we want to have some property which is independent of object. Like "population" is a common
    property and will be shared by all the objects of "Human" class and "population" is something which will be
    common for all the objects. The only way in which population is dependent on object is whenever a new object
    is created of Human class "population" should get increased by 1.
    For this purpose we use "static" keyword in java.

    What is "static" in java?
    ---> static in java is used to declare members of class which belongs directly to class, and are independent
    of objects.
    ---> We can access the static members using class name or using "this" keyword. But due to convention we use
    static members with the name of class.
    ----> "We can use "static" declare members without creating an object of that class."
    ----> We cannot use "this" keyword inside a "static" method because "this" is referencing variable, and it
    is replaced by object name when in use but static methods are independent of objects so, it will not recognise
    "this" there.
     */
    static int population;

    // Similarly, we can have static methods
    public static void printPopulation() {
        System.out.println("The population of humans is: " + population);
    }

    // This method will throw an error because we are using "this" inside "static" method.
//    public static void printName() {
//        System.out.println("The name is: " + this.name); // Error, if we try to access instance variable
//        System.out.println("The name is: " + this.population); // Error, if we try to access static variable
//    }




    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        // As soon as object of this class is created population should get increased by 1.
        Human.population += 1;
        // We can rewrite above line as "this.population += 1" but due to convention it is better to use "static"
        // members with class name.
    }
}

// Here we have created a class "Human" and will use this class in "StaticExample.java" file.

/*
NOTES ABOUT NON-STATIC methods or members:-
---> A "STATIC" member cannot access "NON-STATIC" members but vice-versa is possible.
 */