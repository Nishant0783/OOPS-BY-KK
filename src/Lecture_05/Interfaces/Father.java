package Lecture_05.Interfaces;

public interface
Father {
    // Here I will add some important points about Interfaces in java.

    /*
    POINT 1) "Interfaces" are declared using interface keyword.

    POINT 2) An "Interface" must be "public". No other access modifier is allowed. If we don't give any access
    modifier, compiler will implicitly mark as "public".
    ---> The reason is simple, as marking it "public" allows it to get implemented by any class in any package.

    POINT 3) An "Interface" can have methods which are only declared and not implemented also it can have methods
    which are implemented.

    POINT 5) An "Interface" can't be instantiated because it does not have any constructor. Making constructor
    inside an interface will be an error.

    POINT 6) Since, "Interfaces" can't be instantiated so all the variables must be initialised as we have no
    constructor to initialise them.

    POINT 7) Inside an "Interface" all the variables and methods have some keywords which are implicitly injected
    by compiler.
                i) "public": All the variables and methods in interface are "public" so, that they can get
                accessed by any child class.
                ii) "final": All the variables are "final" inside an interface as there is no way to change them.
                iii) "abstract": All the non-implemented methods inside an interface are marked as "abstract", so
                that they could definitely get overridden.
                iv) "static": All the variables are marked as "static" which signifies that they belong to
                interface itself not to any instance.

     POINT 8) Introduction of JAVA 8 brings some changes in interfaces:
                i) Before JAVA 8 interfaces can only have "abstract" methods. JAVA 8 introduces that a method can
                also be "default" or "static" inside interface.
                ii) JAVA 8 introduces concept of "Functional Interfaces" which are the interfaces with only one
                abstract method. It may or may not have other types of methods. But having only one abstract
                method is necessary.

     POINT 9) "A class 'implements' an 'interface' whereas an 'interface' 'extends' an 'interface'".

     POINT 10) A child class which implements parent interface can be "abstract" but then, child class can't be
     instantiated.
    */

    int FATHER_AGE = 32; // public static final int FATHER_AGE = 32;  (POINT 7)

    void strength(); // public abstract void strength();  (POINT 7)
    void height(); // public abstract void height();  (POINT 7)

    // Allowed since JAVA 8 (POINT 8)
    static void fatherName() {
        System.out.println("Father name is Rahul.");
    }

    default void fatherOccupation() {
        System.out.println("Father occupation is Engineer");
    }

    default void love() {
        System.out.println("A father loves his child more than anyone.");
    }

//  Below code is error. (POINT 5)
//   Father() {
//       System.out.println("Father constructor.");
//   }


}

