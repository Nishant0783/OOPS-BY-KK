package Lecture_06.ExceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
//      int c = a/b;
        /*
        We know that above line will throw an exception "Arithmetic Exception". So, will wrap it up in try-catch
        block.
        */
        try{
            int c = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            /*
            Above line will print the message which is present by default. We can also give our own message.
            */
            System.out.println("Cannot divide by zero");
        }
        /*
        --> "e" is the object of the "Exception" class or the classes which are inheriting "Exception" class.
        --> (Exception e) means we are making an object with name "e" of reference type "Exception".
        --> The reference type of "e" can be any class which is subclass of "Exception" class.
         */

        /*
        In catch block we're catching any exception, but we can be more specific for catching exception.
        We can give the name of exact exception we want to catch.
         */

        try{
            int d = a/b;
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        /*
        Since, "Exception" is parent class to all "exceptions" so, it will catch all the types of in try block.
        But when we want to catch a particular exception we use more precise class names.
        */


        /*
        --------MULTIPLE CATCH BLOCKS--------
        We can include multiple catch in try-catch block, we need to remember one point:
        --> More precise exception should be caught first.
        For eg: We can't use "Exception" class in first catch block and then "ArithmeticException" class in second
        catch block.
        --> The reason is that "Exception" class can except any type of exception so, if we place it first then
        all the exception will get caught on first catch block and there will be no use next catch blocks which has
        more precise exceptions.
         */

        try{
            int e = a/b;
            int arr[] = new int[4];
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*
        First catch block will catch any Arithmetic Exception and all other exceptions will be handled by next catch
        block.
         */

        /*
        try{

        }catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

         Above code is error because in JAVA we can't catch more precise Exception after the "Exception" class.
        */

        /*
        --------------FINALLY BLOCK IN JAVA---------------------
        --> The finally block contains the important code which needs to get executed anyhow.
        --> The finally executes after try-catch block irrespective of whether an exception is thrown or caught.
        --> Finally block must be followed by try-catch or only try block.
        --> We can't have multiple "finally" block.
        */
        try{
            int f = a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally is executed");
        }


        try{
            divide(a, b) ;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        // CUSTOM EXCEPTIONS
       try{
           int num = 5;
           if(num % 2 != 0) {
               throw new CustomException("Number is odd.");
           }
       }catch (CustomException e) {
           System.out.println(e.getMessage());
       }

    }


    /*
    --------THROW AND THROWS IN JAVA------------

    1) throw: "throw" is a keyword which is used to throw an exception explicitly.
    It is used to throw "Checked Exception".

    2) throws: "throws" is a keyword which is used with function declaration to tell that this function might
    throw an exception.

     */
    public static int divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("cannot divide by zero");

        }
        return a/b;
    }

}


/*
Q) What is an Exception?
Ans) An exception is the event which disrupts the normal flow of program's execution. It could occur due to
various reasons like invalid inputs, resource unavailability, or program errors.

Q) What are types of Exceptions?
Ans) There are two types of exceptions
1) CHECKED EXCEPTION: These are the executions which are checked at compile time.
2) UNCHECKED EXCEPTION: These are the executions which are checked at run time.

Q) How to handle exceptions in JAVA?
Ans) In java we can handle exception using try-catch block.
--> "try" block: In this block we write the code which might throw an exception
--> "catch" block: In this block we write the code to handle the exception like what message to show when exception,
occur or how not to break the normal flow of program.


--------> Every "Exception" inherits a parent class which is "Exception" and it inherits "Object" class.
 */