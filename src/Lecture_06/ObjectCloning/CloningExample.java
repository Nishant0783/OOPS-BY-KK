package Lecture_06.ObjectCloning;

public class CloningExample {
    public static void main(String[] args) {
        Human nishant = new Human(20, "Nishant");

        /*
        Now we want to make a copy of nishant object.
        */

        Human nishant2 = new Human(nishant);
//        System.out.println(nishant2.name);
        /*
        What is happening under the hood is: A object "nishant2" is formed and, it is calling the constructor
        which accepts an Object.
        Then in memory a new object nishant2 is created with all the fields same as nishant.
        Initially all the fields have same value but, later on we can change the values.

        ---> This process takes lot of time and processing, so we have a better approach.
        */
//        nishant2.age = 15;
//        System.out.println(nishant2.age);
//        System.out.println(nishant.age);

        /*
        -------The better approach---------
        Instead of creating an object by new keyword, we can use "Cloneable" interface and use it's "clone"
        method.
        *****Go to Human.java to understand more about cloneable interface.*****
        */
        try{
            Human aakash = new Human(22, "Aakash");
            Human akshat = (Human)aakash.clone();
            System.out.println(aakash);
            System.out.println(akshat);
            akshat.name = "Akshat";
            System.out.println("Aakash: " + aakash.name);
            System.out.println("Akshat: " + akshat.name);
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        /*
        In this case new object is created, but it reduces overhead processing
        */

    }
}

/*
While cloning an object there are two types of cloning:
1) Deep Cloning: It is process of creating a new object in memory which is exact copy of original object, including
all the nested object.

2) Shallow Cloning: Shallow cloning in Java refers to the process of creating a new object that shares references
to the same nested objects as the original object.

Details notes are in my notebook.
 */