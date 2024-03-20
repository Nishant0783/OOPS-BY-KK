package Lecture_06.Enums;

public class EnumExample1 {
    public static void main(String[] args) {
        CoffeeSize size = CoffeeSize.BIG;
        System.out.println(size);
        /*
        Q) Explain the internal working of above line?
        Ans)
        ----> "size" is a reference variable of type "CoffeeSize".
        ----> "CoffeeSize" is a reference type for "size" variable.
        ----> "CoffeeSize.BIG": Here, we are using '.' operator to access an object "CoffeeSize" class which is
        "BIG". Remember that, BIG is an object which is already created in memory. The "=" assignment operator
        allows the "size" to point to "BIG".
        So, internally what happens is "size" is made to point to the "BIG".
        NOTE: No new object is created here, only a reference variable is created.
        */

        /*
        PONT 1) Every constant in enum has an index associated with it which starts from 0. We can access that
        from a method provided by enum which is "ordinal()".
        "ordinal()" method is of type "final" means we cannot override it.
        */
        System.out.println(size.ordinal()); // This prints '0'.

        CoffeeSize size1 = CoffeeSize.SMALL;
        System.out.println(size1.ordinal()); // This prints '1'.

        CoffeeSize size2 = CoffeeSize.LARGE;
        System.out.println(size2.ordinal()); // This prints '2'.

        /*
        POINT 2) Every enum has method "values()" which returns an array of all the constants of the type of enum.
        Since it is an array that's why we have to use loop to get the result.
        */
        CoffeeSize[] allValues = CoffeeSize.values();
        for(CoffeeSize value: allValues) {
            System.out.print(value + ", ");
        }


    }
}

enum CoffeeSize {
    BIG,  // Constant 1
    SMALL,  // Constant 2
    LARGE  // Constant 3

    /*
    POINT1) All the constants in enum are "public", "static" and "final".
    Declaring "public" allows us to use it anywhere.
    Declaring "static" allows us to make it independent of objects.
    Declaring "final" allows to make all the variable as constants as we can't change them.

    POINT2) Actually all the constants declared in enum are the objects. To learn about this statement go to
    "EnumExample0"
    */
}

/*
Q) What are enums in JAVA?
ANS) Enum is shorthand for enumerations, which is a special datatype used to define a set of named constants.
It provides a way to create a group of related constants that can be used in place of integers or other primitive
types to make the code more readable, maintainable, and less error-prone.

---> Imagine we have a "CoffeeHouse" where we have different sizes of coffee named as "BIG", "SMALL", "LARGE".
Now, if anyone wants to order a coffee he/she can order for one of these sizes only. To implement this feature
we can make use of JAVA ENUMS where we can add the sizes.

---> While working in web dev we come across many status codes such as "RUNNING", "PENDING", "OK". We want that
response should be from any of these codes only so, we can create enum for the codes.

************IMPORTANT POINTS*****************
POINT 1) An enum can be "public", "protected", "private" or "package-private(default)".
POINT 2) If enum is outside a class then it cannot be "private" or "protected". By default, it will be "public".
POINT 3) We cannot declare an "enum" inside a method.
POINT 4) An enum cannot extend a class but can implement an interface.
POINT 5) Nesting of enums is supported in JAVA.
*/
