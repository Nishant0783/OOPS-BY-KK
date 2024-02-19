package Lecture_02;

public class StaticBlock {
    public static void main(String[] args) {
        // Here we are creating an object of Learn class and then printing value of its static members.

        /*
        ---> As soon as we created obj1 (created means allocated memory using new keyword) the first things that
        loads from class is static block and only once. So, as we created obj1 without writing any print statement
        in main(), we will get "This is static block" printed and further if we try to print the value of "a" and
        "b" we will see that "a = 10" will be printed and "b = 30" will be printed.

        ---> If we further create an object obj2 of Learn class we will see that "This is static block" will not
        get printed again because static block is executed only once when class is loaded at first.

        ---> We have a variable "c" which is static, and we are setting its value in static block and then in
        constructor. Since we know that static block is executed first and then constructor, so final value of
        "c" will be "8".
        */

        Learn obj1 = new Learn();
        System.out.println(Learn.a + "   " + Learn.b);

        Learn obj2 = new Learn();
        System.out.println(Learn.a + "   " + Learn.b);

        System.out.println(Learn.c); // 8 will be printed.

    }
}

class Learn {
    static int a = 10;
    static int b;

    static int c;

    static {
        System.out.println("This is static block");
        b = a*3;
        c = 15;
    }
    Learn () {
        c = 8;
    }


}

/*
What is static block?
---> A static block or static initializer block, is a block of code that is executed when the class is first
loaded in memory for the first time.
---> Static block is executed only once regardless of the number of instances a class has.
---> Static block is loaded before the constructor of a class.
---> We cannot call a constructor inside static block, but we can call static methods.
---> Static blocks are used to initialise class variables.
 */