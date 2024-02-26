package Lecture_03.Encapsulation;

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Nishant", 21, 90);
        // Since "name" is not private so, we can directly access it and set it.
        System.out.println(s1.name);
        s1.name = "Ashu";

        // Since, "age" and "marks" are private so, we cannot access them directly.
//      System.out.println(s1.age);
//      s1.age = 16;
//      The above two lines are error because we are accessing and setting the private members directly.
        System.out.println(s1.getAge()); // This prints the age
        s1.setAge(16); // This sets the age to 16.
        System.out.println(s1.getAge());
    }
}

/*
What is encapsulation?
---> Encapsulation is one of the four principles of OOPS. Encapsulation means bundling of data(attributes) and
the methods that operates on that data into a single unit, known as Class. Encapsulation helps in hiding the
internal implementation details of an object and provides a protective barrier, preventing the direct access of
data from outside the class.

Characteristics of Encapsulation:
1) Data hiding: It hides the internal state of an object and restricts direct access to its data. Access to the
data is only allowed through well-defined methods(getters and setters).
2) Access Control: It allows you to control the access to the internal state of an object. We can use access
modifiers(public, private, protected) to specify the visibility of class members.
3) Modularity: It promotes modularity by organizing data and related behaviours into a single unit(class). This
makes it easier to manage and understand the code.
*/
