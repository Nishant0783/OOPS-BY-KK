// Lecture 01 notes
package Introduction;

public class Introduction {
    public static void main(String[] args) {
//        Student nishant = new Student();

        // Getting the value of all the properties
//        System.out.println(nishant.rno);
//        System.out.println(nishant.name);
//        System.out.println(nishant.marks);
        // In output, we got 0, null, 0.0
        // This is because inside class we have only declared these values and never initialised them and also before getting their values we have
        // never set their value. Therefore, we got by default value of int, String and float as output.


        // Setting value of all the properties
//        nishant.rno = 1;
//        nishant.name = "Nishant Paliwal";
//        nishant.marks = 90.5f;
        // Now, again getting values after setting them
//        System.out.println(nishant.rno);
//        System.out.println(nishant.name);
//        System.out.println(nishant.marks);

        // Creating new object of Student to learn about constructor
//        Student stu1 = new Student();

        // Getting values of all the properties
//        System.out.println(stu1.rno);
//        System.out.println(stu1.name);
//        System.out.println(stu1.marks);
        /*
        After printing the result we can see that we are not getting 0, null, 0.0 as a result even we have not initialised variables anywhere.
        This is because in default constructor we have changed the default values for each variable(Property) and in output we are getting that
        default value only which we have defined in constructor.
         */

//        stu1.rno = 18;
//        System.out.println(stu1.rno);
        // Now we have changed the value of rno for stu1 explicitly so in output we will get that new value.

//        Student stu2 = new Student(5);
//        System.out.println(stu2.rno);
//        System.out.println(stu2.name);
//        System.out.println(stu2.marks);
        // Now we can see that in output we are getting 5, null, 0.0 because we have only set the value of rno and all the other values are by default.

        // Creating new object whose value of property will be set at run time.
//        Student stu3 = new Student(3, "Ashu", 98.4f);
//        System.out.println(stu3.rno);
//        System.out.println(stu3.name);
//        System.out.println(stu3.marks);

        // Creating new object to implement constructor calling other constructor
        Student stu4 = new Student(8, "Saurabh");
        System.out.println(stu4.rno);  // 8  --> Passed here
        System.out.println(stu4.name);  // Saurabh  ---> Passed here
        System.out.println(stu4.marks);  // 98.7  ---> Assigned by default constructor

        Student stu5 = new Student(97.6f);
        System.out.println(stu5.rno);  // 6  ---> Assigned by constructor called inside this constructor
        System.out.println(stu5.name); // Nishant Paliwal  ---> Assigned by constructor called inside this constructor
        System.out.println(stu5.marks); // 97.6  ---> Passed here
    }
}

// This is how we create a class
class Student {
    int rno;
    String name;
    float marks;

    // Creating default constructor for this class
    Student () {
        rno = 15;
        name = "Aakash Akshat";
        marks = 98.7f;
    }

    // As we have made default constructor, similarly we can make other constructors also
    Student (int rno) {
    // rno = rno
        /*
        Inside this constructor we cannot assign value to "rno" like I have tried in above commented code because there are two variables with same
        name but different work.
        "rno" defined in parameter is just a name of variable which will store int type value which we will pass while creating an object.
        "rno" written in LHS of commented code refers to the "roll no" property of this class which we have defined above.
        Both the variables have different work but same name which causes confusion for compiler to assign what value to which variable.
         */
        /*
        There are two solutions to this problem:
        1) Change the name of any one variable and, then we are good to go. But, due to convention we should write the same names. So, we can't use
        this method.
        2) Use "this" keyword which is reference variable. "this" keyword is used to refer to the current object within a method or constructor.
         */
        this.rno = rno;
        /*
        "this" will be replaced by the name of the object we will create using this constructor.
        Suppose we created "stu2" using this constructor then "this" will be replaced by "stu2" and whole line will become "stu2.rno = rno", which
        is same as setting the value of a property.
        */
    }

    // Another constructor which will take all the values of property while creating object
    Student (int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // We can also call a default constructor inside another constructor using "this()"
    Student (int rno, String name) {
        this();
        this.rno = rno;
        this.name = name;

    }

    // Not only default constructor, we can also call any other constructor inside other constructor.
    Student (float marks) {
        this(6, "Nishant Paliwal", 98.6f );
        this.marks = marks;
    }

    // NOTE -----> While calling constructor inside another constructor, constructor call should be the first statement inside the constructor. It is
    // language requirement because it helps in maintaining the predictable order.

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


/*
Let's study the syntax for object creation:
" Car scorpio = new Car(); "
--> "Car" is the name of the class whose object we want to create.
--> "scorpio" is the reference variable which will store the address of the actual object created in heap.
--> "new" is the keyword which allows us to dynamically allocate memory.
--> "Car()" is the default constructor of the "Car" class.
 */

/*
What is a constructor?
A constructor is a method with the same name as class name and with no return type even "void".
Every class has atleast one constructor which is called as "default constructor". This constructor is created by implicitly if not created explicitly.
The work of the constructor is to initialise the instance variable.
For eg: Above in code we have seen that when we tried to print the value of properties of "Student" class without initialising them, then we got their
by default values. The question is who has given them default value? Behind the scene what happened is when we created the object of student class
we used "Student()" which is default constructor of "Student" class. That default constructor implicitly initialised those properties with default
values.

--> The work of default constructor is to initialise the variables with default values. We can change the default values to some other values by
overriding default constructor.
--> Default constructor is always parameter less.
--> A class can have any number of constructors but each constructor should have different numbers of parameters or different data-types of
parameters.
---> We can call default constructor
 */