package Lecture_03.Polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();

        /*
        Here we can notice that when we call area() method on different object which have referencing type as
        Shapes class but constructor from child class. The output will be area() method from the class of which
        constructor is called.
        ------------------------------------------------------------------------------------------------------
        Q) How java determines which class method to call as Shapes, and also it's child classes has "area()" \
        method?
        ------> If we look into notes of inheritance we have some points there, in those points if we see POINT 2
        there we have written that "reference type of object determines what members it has access to". Here, we
        have an addon to that point which is:

        "Whenever a child class inherits a parent class and both have same method which is overridden by child
        class then the reference type of object determines the accessibility of members(POINT 2) and which method to call
        is decided by constructor."

        For eg: Here we have "area()" method in "Shapes" class and also in "Circle" class. But when we create
        object of reference type of "Shapes" but call constructor of "Circle" class then the "area()" method
        of "Circle" class is invoked. But, if "Circle" class is not having "area" method then it will invoke
        method of "Shapes" class.
        */

        /*
        --------------------------------------UPCASTING IN POLYMORPHISM-------------------------------------------
        ---> Upcasting is casting a reference variable from a more specific type(sub-class or child class) to more
        general type(super-class or parent class). This conversion is performed implicitly by compiler.
        For eg: As we have seen above, when we have reference type of parent class but constructor of child class
        this is upcasting, because here java implicitly cast reference variable to parent class.

        --------------------------------------DOWNCASTING IN POLYMORPHISM-----------------------------------------
        ---> Downcasting is casting a reference variable from a general type(super-class or parent class) to more
        specific type(sub-class or child-class). This conversion is performed explicitly done by programmer.
        This is same as type casting in variables.
        For eg: In the above code we have only done upcasting because there we have reference type of parent
        class and constructor of child class.
        In downcasting we don't create a new object and allocate memory to it, what we do is we just type the
        previously created object and store change its reference variable.
        Like, first we create an object of Circle class which is referencing to Shapes class, and then we will
        downcast it.
        Shapes s1 = new Circle();
        Circle c1 = (Circle) s1;

        -----------> In downcasting no new object is created else downcasting operation is about assigning an
        existing reference variable to another reference variable of a more specific type.
        Below code proves the above statement.
         */
        Shapes s1 = new Circle();
        System.out.println(s1);
        Circle c1 = (Circle) s1;
        System.out.println(s1);
        System.out.println(c1);
        // The output of the following code will give same hashcode.

        /*
        ---------------------------------------TYPES OF POLYMORPHISM--------------------------------------------
        1) Compile time polymorphism / Static polymorphism:
        -----> This polymorphism is related to "method overloading/constructor overloading". When a single class
        has multiple methods with same name but different   i) number of parameters    ii) types of parameters
        it is called method overloading.
        We have a class triangle, inside it, we have many methods with name "area()" but different signatures.
        When we create an object of triangle class and call the area() method using that object what happens
        under the hood is compiler matches the number and types of arguments with the methods defined in class.
        Then call the exactly matched method.
        For eg: Triangle t1 = new Triangle():
                 t1.area(4, 5);
        What is happening bts is the compiler search for area() method with two parameters of int type inside
        triangle class and then call it.

        All this process happens at compile-time, means when we compile the code at that time only compiler
        decides which method to call. That's why "Method overloading" is a compile time polymorphism.

        Same logic goes for "Constructor Overloading".
        *******************************************************************************************************

        2) Run time polymorphism / Dynamic polymorphism:
        -----> This polymorphism is related to "method overriding". When a method of parent class is redefined
        in child class but with same signatures then, this process is called method overriding.

        We have a class Shapes which has a method "area()". This same "area()" method is in child classes like
        Triangle, Circle or Square. When we create an object of child classes but have the reference variable of
        parent class then what happens under the hood is at run time compiler search for that method in class of
        which constructor is called and invoke it.
        For eg: Shapes s1 = new Circle();
                s1.area();
        So, at runtime compiler will search for "area()" method in Circle class, if found then it will invoke
        area() method of circle class, if not found then it will invoke method of Shapes class.
        This is known as "DYNAMIC-METHOD DISPATCH" because run-time compiler dynamically finds for method.
                          ------------------------
        -----------> This only works with overridden methods. The method called must be available in Parent
        class. It may or may not available in child class because child class can inherit from parent class.
        */

        // COMPILE TIME POLYMORPHISM EXAMPLE:
        Triangle t1 = new Triangle();
        t1.area(4, 3);
    }
}

/*
Q) What is polymorphism?
-----> "Polymorphism" is a one of the 4 principles of OOPS. It is a greek word where "Poly" means many and
"morphism" means ways to represent.
So, polymorphism means representing a same thing in many different ways.
For eg: Suppose there is a parent class which has a method called "area()" . Now that parent class is extended by
its child class and that child class also have "area()" as a method. So, this is polymorphism where the same area()
method has different definitions in parent class and child class.
 */
