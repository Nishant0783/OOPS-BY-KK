package Lecture_04.Access_Modifiers;

public class AccessModifiers {
    private int age;
    public String name;
    protected int marks;
    int friends; // default

    public AccessModifiers(int age, String name, int marks, int friends) {
        this.age = age;
        this.name = name;
        this.marks = marks;
        this.friends = friends;
    }

    // Getter to access age
    public int getAge() {
        return age;
    }

    // Setter to set age
    public void setAge(int age) {
        this.age = age;
    }
}
