package Lecture_06.ObjectCloning;

/*
public class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.name = name;
        this.age = age;
    }
    Human(Human obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

}
*/

/*
To clone an object using "clone" method we need to implement "Cloneable" interface to the class whose object we
need to clone.
*/

public class Human implements Cloneable {
    /*
    Q) The "Cloneable" interface is empty so why do we need to implement it?
    Ans) If we have to clone an object we need to use "clone()" method present in "Object" class, we need to
    implement "Cloneable" interface as it serves as a marker interface which tells the JVM that this class is
    allowed for cloning the objects using "clone()" method.
    */
    int age;
    String name;

    Human(int age, String name) {
        this.name = name;
        this.age = age;
    }
    Human(Human obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
    Here we are overriding clone() method from "Object" class which throws "CloneNotSupportedException".
    This exception will be thrown when we will override "clone()" method without implementing "Cloneable"
    interface.

    ---> This method will call clone method from "Object" which is a "native" method which means it is implemented
    in "C" language.
     */
}
