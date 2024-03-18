package Lecture_06.ExceptionHandling;

/*
In JAVA, we can create our own exceptions. We just need to extend "Exception" class and call its constructor.
 */
public class CustomException extends Exception{
    CustomException(String messasge) {
        super(messasge);
    }

}
