package Lecture_03.FinalAndStatic;

public class FinalExample {
    public static void main(String[] args) {
        FinalParent fp1 = new FinalParent();
//      fp1.a = 19; This is error as "a" is marked as final.


    }
}

/*
We have already learnt about "Final" keyword in Java. These are just some extra points:-
1) Declaring a class as "Final" prevents a class from getting inherited.
---> "In java declaring a class as "final" prevents inheritance."

2) As we declare a class as "final" it's methods also becomes "final".
---> "In java, when we declare a class as "final" its methods implicitly declared as "final". Although, instance
variables remain in same state as declared."

3) Since, final class cannot be inherited therefore its method cannot be overridden.
---> "In java, overriding of methods marked as "final" or methods from class which is marked as "final" is not
allowed.

4) "In java, instance variables marked as "final" or instance variable marked as "final" in a "final" class cannot
be changed after initialisation.
 */