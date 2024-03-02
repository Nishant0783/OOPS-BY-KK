package Lecture_05.Interfaces;

public class Child implements Father, Mother{
    @Override
    public void eyes() {
        System.out.println("Child has eyes like mother.");
    }

    @Override
    public void hairs() {
        System.out.println("Child has hairs like mother.");
    }

    @Override
    public void height() {
        System.out.println("Child has height like father.");
    }


    @Override
    public void strength() {
        System.out.println("Child has strength like father.");
    }

    /*
    Since, we have two methods with name "love()" in both Mother and Father interfaces both are default so by
    rules of interfaces we don't have to override them in child class. But, the problem is when we try to call
    "love()" method from the object of child class then compiler will get confused which method to call. So, we
    need to override "love()" method here and inside it, either we can give whole new definition or we can use
    "super" keyword to call "love()" method of any one of the interfaces or can call "love()" method from both
    the interfaces.
    Here we will call method from "Mother" interface.

    ---> IntelliJ suggests to override the method of first interface which we implement. Like, here we have
    written "public class Child implements Father, Mother", which means first we are implementing Father and then
    Mother, so it suggests us to override method of Father interface.
    */
    @Override
    public void love(){
        // Whole new definition
        System.out.println("Both father and mother love their child.");

        // From below two lines of code we can use any one of them or can call both of them.
        Mother.super.love();
        Father.super.love();
    }

}


// Below code is just for exploration purpose.
class Son extends Child {
    String name;
    Son(String name) {
        this.name = name;
    }

}
