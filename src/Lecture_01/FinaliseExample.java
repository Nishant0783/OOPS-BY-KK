package Introduction;

public class FinaliseExample {
    public static void main(String[] args) {
        B obj1;
        /*
         Here we will use a hack to see working of garbage collector.
         The hack is we will repeatedly create the object of class B large number of times, a time will come
         when the memory will get full and then java garbage collector will work to delete the previously
         objects and then, we will be able to see the working of finalise().
         */
        for(int i = 0; i<=10000000; i++) {
            obj1 = new B();
        }
    }
}

class B {

    @Override
    protected void finalize() throws Throwable {
         System.out.println("Object is destroyed");
    }
}


/*
"finalise" keyword in java is used to perform some actions before calling garbage collector.
Means whenever an object has no longer use in project then, java automatically calls the garbage collector to
delete that object from memory and free some memory. We cannot control the calling of garbage collector but what
we can control is the before calling garbage collector we can perform some action.
To do so we use need to "finalise()" method which is declared in "Object" class.
 */