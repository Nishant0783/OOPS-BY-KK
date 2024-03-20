package Lecture_06.Enums;

/*
Basic definition of enums is written in "EnumExample1".
*/

/*
IN THIS FILE WE WILL LOOK IN INTERNAL WORKING OF ENUMS.
 */
public class EnumExample0 {
}


/*
Here we will take the example of "Coffee" enum which we have created in "EnumExample1.java".

Let us create a class "Coffee" which extends "Enum<>" generic class.
------> NOTE: We cannot directly extend "Enum" class as it is "Final". This is just for demonstration purpose.
        To use "Enums" we use "enum" keyword.

-------------------------------------------------CODE STARTS----------------------------------------------------

public final class Coffee extends Enum<Coffee> {
        public static final Coffee SMALL = new Coffee();
        public static final Coffee BIG = new Coffee();
        public static final Coffee LARGE = new Coffee();

        private Coffee() {};
}

-------------------------------------------------CODE ENDS------------------------------------------------------
------> NOTE: This is not the actual internal working of "enums". This is just an idea that internally "enums"
        might look like this.


*******IMPORTANT POINTS*********
POINT 1) As we can see that all the constants we declare inside an enum are actually the objects which we create
of the class which extends "Enum" class.

POINT 2) We can't create the objects of enums outside the enum's constructor is private.
*/


