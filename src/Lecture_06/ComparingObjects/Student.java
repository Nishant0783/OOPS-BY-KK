package Lecture_06.ComparingObjects;

public class Student implements Comparable<Student> {
    float marks;
    int roll;

    public Student(float marks, int roll) {
        this.marks = marks;
        this.roll = roll;
    }

    @Override
    public int compareTo(Student o) {
        // Here, the logic is to compare objects based on their marks.
        // Since, the method has return type of "int" that's why we are returning the difference of marks.
        // Implementation logic will be:
        // diff > 0: marks of "o" are less.
        // diff < 0: marks of "o" are more.
        // diff == 0: both have same marks.

        System.out.println(this.marks - o.marks);
//        return (int)(this.marks - o.marks);
        // This is one way to compare.


        // If we go deep in wrapper classes implementation, they have a method "compare()" which is static
        // and we can also use that method to compare objects which also return "+1" when "o" is greater and
        // "-1" when "o" is less.

        // Since marks are float so, we will use "Float" wrapper class.
        return Float.compare(this.marks, o.marks);
        // The internal implementation is of "compare" method is same as we have done in main class.
        /*
            if(f1 < f2){
                return -1;
            }
            if(f1 > f2){
                return 1;
            }
        */


    }
}
