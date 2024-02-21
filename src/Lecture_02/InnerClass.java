package Lecture_02;

public class InnerClass {
    int member1;
    InnerClass () {
        this.member1 = 15;
    }

    class FalseTest {
        int age;
        public FalseTest(int age) {
            this.age = age;
        }
    }
    static class Test {

        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        FalseTest obj1 = new FalseTest(5); This is an error because FalseTest is not static, so it depends on
//        the instance of "InnerClass" but till now we don't have any instance of "InnerClass".

        /*
        Below written code works fine because "Test" class is marked "static" so it does not depend upon instance
        of "InnerClass".
        */
        Test a = new Test("Nishant");
        Test b = new Test("Aakash");

        InnerClass obj = new InnerClass();
        InnerClass.FalseTest obj1 = obj.new FalseTest(5); // This is the correct syntax for creating object of non-static inner class.
        /*
        Explanation of above syntax:
        ---> "InnerClass.FalseTest obj1": In this line we are just declaring a reference variable "obj1" of the FalseTest class
        but since we FalseTest is non-static, so we need outer class to access it that's why we are using
        "InnerClass.FalseTest".
        ---> "obj.new FalseTest(5);": In this line we are actually allocating memory to the instance of outer class but,
        again we need instance of "InnerClass" to instantiate "FalseTest" class so we are using "obj.new".
        */

//      obj1.member1 = 9; Gives error because can't access the members of outer class using instance of inner class.
        obj.member1 = 9; // This is a right way to access member1.

    }
}


/*
In this file we will see about nested classes in static context.
---> STATEMENT 1) "Outer class cannot be static."
=> To understand this statement we need to have some knowledge about nesting of classes.
Whenever in java, classes are nested then the inner class depends upon the 'instance' of outer class which means
until we have object for outer class we cannot access the inner class.
If outer class is "static" this means it does not depend on the object, and if the outer class has no relation
objects then how can we use inner class. That's why outer class cannot be static.

---> STATEMENT 2) "Inner class can be static."
=> We know that "static" keyword works with members of a class and when working with nested classes inner class
act as member of outer class, so we can use "static" with inner class. It means that to access inner class we
don't need any object of outer class.
 */

/*
NOTES ABOUT NESTED CLASSES:
---> In java a non-static inner class has a reference to outer class but cannot access the members of outer class
directly.
Like, we have "obj1" as an object of "FalseTest" class, but we cannot access "member1" using syntax "obj1.member1".
To access "member1" either can directly call it using "obj" which is instance of "InnerClass" or we can make a
method inside "FalseTest" class which will access it, and then we can use that method with "obj1".

---> In java a static inner class has no reference to outer class. So we cannot access members of "InnerClass"
directly, either we can make a method inside "Test" class where we are accessing "member1" and then using that
method we can access "member1" with instance of "Test" class.
 */