package Lecture_03.Encapsulation;

public class Student {
    String name;
    private int age;
    private int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    /*
    We cannot directly access the private members outside the class. So, to get the value of private members we
    need "Getters" methods and to set their value we need "Setters" methods.
    */
    // Getter for "age"
    int getAge() {
        return age;
    }

    // Setter for "age
    void setAge(int age) {
        this.age = age;
    }
}
