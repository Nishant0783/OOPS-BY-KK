package Lecture_03.Inheritance;

public class BoxPrice extends BoxWeight{
    int price;
    BoxPrice() {
        System.out.println("This is constructor of BoxPrice class which is child class of BoxWeight class");
    }


    // Here we are calling the constructor of parent class which is "BoxWeight" class by using "super" keyword.
    // But, it is important to note that there should a constructor in "BoxWeight" class which takes one parameter.
    // Otherwise, java will throw an error.
    BoxPrice(int mass, int price) {
        super(mass);
        this.price = price;
        System.out.println("The mass is: " + mass + " and price is: " + price);
    }
}
