package Introduction;

public class FinalExample {
    public static void main(String[] args) {
        final int a = 10;
        // a = 15; This will throw error because we are trying to modify a constant.

        A obj1 = new A("Nishant");
        // obj1.rno = 15; Again this will throw an error because we are trying to modify a variable which is
        // marked as final.

        /*
        When we mark an object as final, then we cannot assign a new object to it.
         */
        A obj2 = new A("Aakash");
        obj2 = new A("Avi");
        // Above code is normal where are assigning a new value to previously initialised object.

        final A obj3 = new A("Saurabh");
        // obj3 = new A("Adi"); This is an error because here we are modifying an object which is assigned as final.
        obj3.name = "Ayush";
        System.out.println(obj3.name);
        // Although we can modify the properties inside that object if properties are not marked as final.
    }
}

class A {
    final int rno = 1;
    String name;

    A (String name) {
        this.name = name;
    }

}

/*
"Final" is a keyword which allows us to declare constants when used before a variable declaration.
A variable marked as "final" should be initialised with a valid value.
For eg: We declared a variable " final int a = 10; "  in next line we try to change value of a " a = 15; ". It
will throw an error because we cannot change the value of a variable marked as final.
 */