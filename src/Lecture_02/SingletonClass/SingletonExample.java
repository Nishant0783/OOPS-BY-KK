package Lecture_02.SingletonClass;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        /*
        What happened under the hood is that when we first called "getInstance()" then "instance" was null, so it
        created a new object which gets pointed by "ob1" reference variable.
        When we second time called "getInstance()" method then "instance" was not null, so it returned "instance"
        and now "obj2" is also pointing to same instance which obj1 was pointing to.
        Same happened for "obj3".
        */

        /*
        NOTE: "obj1", "obj2", "obj3" are just three different reference variables pointing to one same instance.
        Don't interpret them as three different variables pointing to three different instances.

        We can confirm this by printing all the reference variables and we will get same value.
        */
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}

class Singleton {
    // Step 1)
    private Singleton(){};

    // Step 2)
    private static Singleton instance;

    // Step 3)
    public static Singleton getInstance() {
        // Step 4)
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}



/*
What is a singleton class?
---> A singleton class is a class which is designed to have only one instance, and it provides global point of
access to that instance. "Global point of that instance" means that the instance of singleton class can be accessed
from any part of program that has visibility to the singleton class.
*/

/*
Q) How to limit a class to only one instance?
---> The first thing which should come to mind is: "An instance is made when the constructor of a class is called."
So, to make a class limit to only one instance we should limit its constructor be called only once.

New Question -----
Q) How to limit the constructor to get called only once?
---> The constructor of the class should be set to "private" so that it can be called only from the same package.
This only limits the constructor to be called from any other package. But till now we call constructor any number
of times.

......LOGIC TO CREATE A SINGLETON CLASS......
Step1) Make constructor private for the class.
Step2) Inside the class define a "private static" variable which will be of type Parent class. Let's say the variable
created named as "instance".
Q) What is the use "instance"?
---> "instance" is created as a reference variable which will point to the object created by the parent class.

Step3) Create a "public static" method "getInstance()" which will have the return type same as Parent class.
Q) What is use of "getInstance()"?
---> "getInstance()" is a helper method which we will actually use to create instance of private class.

Step4) Inside "getInstance()" method we will check that if any instance of parent class is created or not.
To implement this we check if (instance == null) then we will create a new object otherwise we will return the
previously created instance.
Any instance of the parent class is created then it will be stored in "instance" variable so first time, when no
instance is created then, "instance" will be null and if any instance is created then "instance" will be not equal
to null, so we will return what ever is inside "instance".

---------------> We have marked "getInstance()" as "static" because we want that this method should not dependent
on object because we want to call it using class.
---------------> Same reason goes "instance". We want that "instance" should be same for all the references of
the class created.
 */