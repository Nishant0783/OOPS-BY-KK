package Lecture_03.FinalAndStatic;

public class StaticExample {
    public static void main(String[] args) {
        StaticParent sp1 = new StaticParent();
        StaticParent sp2 = new StaticChild();
    }
}

/*
We have already learnt about "Static" keyword in java. These are some extra points:-
1) A method marked "static" cannot be overridden.
---> "Java does not allow us to override a "static" method. As "static" is independent of objects and "overriding"
is dependent on objects.
*/


/*
-----------------------------------------EARLY / STATIC BINDING IN JAVA-------------------------------------------
When compiler resolve a method(means which method to call) at compile time it is called "early binding".
Calling a static method is an example of "Early Binding".

-----------------------------------------LATE / DYNAMIC BINDING IN JAVA-------------------------------------------
When compiler resolve a method or instance variable(means which method to call or which variable to use) at
run time it is called "late binding".
Now, it might sound similar as "Dynamic method dispatch" as "Dynamic method dispatch" is sub part of "Late
Binding". In "Late Binding" both instance variables and methods are considered whereas in "Dynamic method
dispatch" only method are considered.
*/