package Lecture_04.Access_Modifiers_Helper;

import Lecture_04.Access_Modifiers.AccessModifiers;

public class Main {
    public static void main(String[] args) {
        AccessModifiers am1 = new AccessModifiers(21, "nishant", 90, 4);
//      am1.marks = 96; This line is error because we are trying to access a protected member from different
//      package.

        A obj = new A(21, "nishant", 90, 4);
        System.out.println(obj.getMarks());
        System.out.println(obj.getFriends());
    }
}


class A extends AccessModifiers {
    public A(int age, String name, int marks, int friends) {
        super(age, name, marks, friends);
    }
    public int getMarks() {
        return marks; // Here we can access marks as we are in subclass of "AccessModifiers" even we are in
//      different package.
    }

    public int getFriends() {
//      return friends; This line is error we are accessing "default" marked member in different package.
        System.out.println("Cannot access 'marks' as it is marked 'default'.");
        return 0;
    }

}