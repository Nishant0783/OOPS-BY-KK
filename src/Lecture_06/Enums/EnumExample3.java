package Lecture_06.Enums;

public class EnumExample3 {
    public static void main(String[] args) {
        Marks stu = Marks.AVERAGE;

        /*
        here we can apply if-else
        */

        if(stu.equals("GOOD")) {
            System.out.println(stu.getMarks());
        } else if (stu.equals("AVERAGE") ) {
            System.out.println(stu.getMarks());
        }else {
            System.out.println(stu.getMarks());
        }


        /*
        A better way is to use switch case here:
        */
        switch(stu) {
            case GOOD :
                System.out.println("Marks of good student is" + stu.getMarks());
                break;
            case AVERAGE :
                System.out.println("Marks of average student is" + stu.getMarks());
                break;
            default:
                System.out.println("Marks of failed student is" + stu.getMarks());
                break;
        }
    }
}

/*
In this file we will see about if-else and switch statement in enum.
-----> Suppose we have an enum of "MARKS" with three constants "GOOD", "AVERAGE", "FAIL" which have some marks
associated with them.
*/

enum Marks {
    GOOD(90),
    AVERAGE(50),
    FAIL(20);
    private final int marks;
    Marks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}
