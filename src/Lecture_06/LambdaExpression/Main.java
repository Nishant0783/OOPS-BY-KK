package Lecture_06.LambdaExpression;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        We have an interface "Calculator" and we have a method "sum" there. Now to use that method we have to
        override it in any child class which I have done below.
        */
        SumCalc s1 = new SumCalc();
        int ans = s1.sum(4, 6);
        System.out.println(ans);

        /*
        The interface "Calculator" is "Functional Interface" as it has only one abstract method. Now, creating
        a new class then implementing that only abstract method in that class makes code more lengthy. So,
        to reduce the length of code "Lambda expressions" are used. These expressions are somewhat like
        arrow functions in JS.
        Syntax: (parameter) -> (expression)    OR   (parameter) -> {statements;}
        // If expression is used then it automatically gets returned

        So, now the code for "sum()" reduces to:
        */

        // This is lambda function for sum() method:
        // Here we are declaring variable "sumCalc" of type "Calculator".
        Calculator sumCalc = (x, y) -> (x+y);

        int res = sumCalc.sum(8, 9);
        System.out.println(res);

        // Similarly we can use lambda expression to reduce the length of Arrays.sort() method.
        String arr[] = {"a", "ab", "bcd", "abdf", "213"};
        Arrays.sort(arr, (o1, o2) -> (o1.length() - o2.length()));
        for(String s: arr) {
            System.out.print(s + ", ");
        }
    }
}
class SumCalc implements Calculator{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
