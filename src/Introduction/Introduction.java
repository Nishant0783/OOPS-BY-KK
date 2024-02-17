// Lecture 01 notes
package Introduction;

public class Introduction {
    public static void main(String[] args) {
        Student nishant = new Student();

        // Getting the value of all the properties
        System.out.println(nishant.rno);
        System.out.println(nishant.name);
        System.out.println(nishant.marks);
        // In output, we got 0, null, 0.0
        // This is because inside class we have only declared these values and never initialised them and also before getting their values we have
        // never set their value. Therefore, we got by default value of int, String and float as output.


        // Setting value of all the properties
        nishant.rno = 1;
        nishant.name = "Nishant Paliwal";
        nishant.marks = 90.5f;
        // Now, again getting values after setting them
        System.out.println(nishant.rno);
        System.out.println(nishant.name);
        System.out.println(nishant.marks);


    }
}

// This is how we create a class
class Student {
    int rno;
    String name;
    float marks;
}


/* What is a class?
"A class is a named group of properties and functions."
A class is a template which defines the structure of an object. A class is a non-existing entity which takes no space in memory.
In java, we can create a class by using "class" keyword.
By convention, we should write the name of class starting with capital letter.
*/


/* What is an Object?
An object is real world entity which actually holds space in memory.
Every object has a:   i) state   ii) behaviour    iii) identity
*/

/* For eg: We have a template of a car. Template means a design of a car. The templates include that a car should have "seats", "engine", "color".
Now, this template do not run on roads. What goes on roads is a real car which has the following properties. That real car can be "Alto", "Scorpio"
or any other.
So, relating this to OOPS we can say that the "car template is a class" which defines only structure and "each car like "alto", "scorpio" are the
individual objects" which follows the property defined in template but may or may not have different values of that properties.
*/

/*
How to create an Object in JAVA?
To create an object in JAVA we have to use "new" keyword.
The "new" keyword allows us to dynamically allocate memory for the object. Dynamic memory allocation means the memory is allocated at run time.
SYNTAX for creating object:  " className objectName = new classConstructor(); "
For eg: Creating object for car class: " Car scorpio = new Car(); "

---> Some insights:
1) While creating an object of a class the LHS part is created at compile time and RHS part is created at run time.
2) The LHS part is just declaring an object and RHS part is actual allocation of memory.
3) The reference variable is stored in "Stack memory" holding the address of the actual object which is stored in "Heap memory".
Reference variable means the name of the object.
*/

/*
How to access the properties of a class using object?
In java to access the properties of a class using an object we use '.' operator.
For eg: If we want to access the "color" property of "car" class using "scorpio" object we can write: " scorpio.color " and we get the value of
this property and also can set the value of this property.
*/
