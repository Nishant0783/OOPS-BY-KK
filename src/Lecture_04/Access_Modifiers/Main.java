package Lecture_04.Access_Modifiers;

public class Main {
    public static void main(String[] args) {
        AccessModifiers am1 = new AccessModifiers(15, "Nishant", 90, 4);
//      am1.age = 21; This line is error as we are trying to access protected member directly.
//      We can use getters and setters to access and set the protected members.
        System.out.println(am1.getAge());
        am1.setAge(21);
        System.out.println(am1.getAge());

        am1.marks = 19; // Here we can access "marks" because we are in same package.
        am1.friends = 2; // Here we can access "friends" because we are in same package.
    }
}

/*
What are access modifiers in Java?
---> In java, access modifiers are the keywords which control the visibility and accessibility of classes, fields,
methods. They control scope and level of encapsulation of the members of a class.

Java provides 4 access modifiers:-
1) Public:  Members declared as "public" can be accessed inside any class, regardless of package.
2) Protected: Members declared as "protected" can only be accessed from same package.
****We can also access the "protected" members from the subclass even the package is not same.
3) Private: Members declared as "private" can only be accessed inside same class. We need getters and setters
methods to access them outside the class in which they are declared.
4) Default: When no access modifier is specified "default" is implicitly injected by compiler for that member.
Members declared as "default" can be accessed inside same package.
****The only difference between "default" and "protected" is that "protected" declared members can be accessed
inside subclass if package is not same but "default" members strictly follows that they can't be accessed outside
the package.
*/