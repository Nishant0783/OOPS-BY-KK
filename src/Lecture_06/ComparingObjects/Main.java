package Lecture_06.ComparingObjects;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(80.9f, 3);
        Student s2 = new Student(78.9f, 5);


        /*
        In java, we cannot compare objects directly. Like this:
        if(s1>s2) {
            System.out.println("s1 is greater than s2");
        }else {
            System.out.println("s2 is greater than s1");
        }

        The above code snippet is an error in java because it will get confused which one to compare as we have
        marks and roll both.
        If we have only one instance variable then also it is not allowed to compare object with relational
        operator.
        -----EXCEPTION----- "==" operator can be used to compare objects but, it returns true only if both
        operands are pointing to same object.
         */
        /*
        Q) If we can't use relational operator for object comparison then how do we compare them?
        ANS) To compare objects JAVA provides a "Comparable" interface which is generic. The "Comparable" interface
        has a "CompareTo()" method which allows us to define our own comparison logic.

        ---> To use "Comparable", Student class will implement comparable and will override "CompareTo()" method.
         */

        // Now, I can use "compareTo()" method
        if(s1.compareTo(s2) > 0) {
            System.out.println("marks of s1 are greater than s2.");
        }else {
            System.out.println("marks of s1 are lesser than s2.");
        }


        /*
        We can use this "compareTo()" method to define our own logic to compare elements in array.
        ---> Arrays.sort() methods takes a second parameter too which is comparable.
        */

        String arr[] = {"a", "ab", "bcd", "abdf", "213"};
//        Arrays.sort(arr);
//        for(String s: arr) {
//            System.out.print(s + ", ");
//        }
        // The above sort method is sorting the arr[] based on dictionary order. But what if we want to sort the
        // arr based on length of string. For this we can use "Comparable".
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println((o1.length() - o2.length()));
                return (o1.length() - o2.length());
            }
        }
        );
        for(String s: arr) {
            System.out.print(s + ", ");
        }

        /*
        Now we can see that the output is sorted based on length of string.
        */

        /*
        The syntax of "Arrays.sort()" method has became pretty large, so to shorten it we will use lambda expression.
        GO TO LAMBDA EXPRESSION PACKAGE:
        */

    }
}
