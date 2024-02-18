package Lecture_02;

public class StaticExample {
    int a;
    public static void main(String[] args) {
        /*
        Since "Human" class is in same package as "StaticExample" and is marked "public" so, we can directly use
        "Human" class.
        */
        Human nishant = new Human(20, "Nishant", 90000, false);
        /*
        Since, in Human.java we have declared some static members which we can use here but with the name of class.
        We can use it with name of object but due to convention we will use it with class name.
         */
        System.out.println(Human.population);
        Human.printPopulation();

        Human aakash = new Human(20, "Nishant", 90000, false);
        System.out.println(Human.population);
        Human.printPopulation();

    }
}

/*
So, far we have learnt about "static" keyword.
Question) Why "main()" method is static?
---> To answer this let's see what, actually "main()" method is and what does it do.
So, "main()" is a method which runs at first place when program gets executed. Without "main()" method we cannot
run a program. Also, "main()" method lies inside a class.
This explanation should pretty much clear our answer. When "main()" is the first thing which runs on execution of
a program and is inside a class, so we need some mechanism so that without creating object of that class we can
run a method. That's why "main()" is marked as static.
*/
