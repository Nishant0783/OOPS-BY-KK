package Lecture_06.Enums;

public class EnumExample2 {
    public static void main(String[] args) {
        CoffeeSizes big = CoffeeSizes.BIG;
        System.out.println(big.getSize());

        CoffeeSizes latte = CoffeeSizes.RANDOMSIZE;
        System.out.println(latte.getSize());
        System.out.println(latte.getName());
    }
}

/*
In previous file we have seen basics of enums. Now in this file we will move on to some advance concept in enum.

Earlier we have an example of CoffeeSize enum which has size as "BIG", "SMALL", "LARGE". Now, what we want is
to assign an exact value to these sizes.
---> The syntax is simple: Just after the declaration of constants, inside round braces add that value.

---> Let's add size = 1 for "SMALL", size = 2 for "BIG",  size = 3 for "LARGE'.

----------------------INTERNAL CODE START---------------------------

public final class Coffee extends Enum<Coffee> {
        protected static int size;
        public static final Coffee SMALL = new Coffee(1);
        public static final Coffee BIG = new Coffee(2);
        public static final Coffee LARGE = new Coffee(3);

        private Coffee(int size) {
            this.size = size;
        };
}

----------------------INTERNAL CODE END---------------------------
----> In above code we can see that we are passing the value of size in constructor of "Coffee" class.
----> So, first we need a variable to track size which will be "private" and "final" so, that it could not be
accessed outside the class and, it's value can't be changed.
Second, we need a constructor to assign the value of size to it.
----> Since, the size is private so, we need to have getters to get size.
*/

enum CoffeeSizes  {
    BIG(2),  // Constant 1
    SMALL(1),  // Constant 2
    LARGE(3),   // Constant 3
    RANDOMSIZE("Latte" , 4);
    private final int size;

    private CoffeeSizes(int size) {
        this.size = size;
    }

    /*
    We can also make constructor to take one or more arguments.
    ---> For eg: we have a "randomSize" which takes two arguments which is a "size name" and a "value".
    */
    private String name;
    private CoffeeSizes(String name, int size) {
        this.name = name;
        this.size = size;
    }
    /*
    NOTE: the above constructor is applicable to all the constants, not only to RANDOMSIZE constant.
     */
    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }

}
