package Lecture_05.Interfaces;

public interface Mother {
    int MOTHER_AGE = 30;

    void eyes();
    void hairs();

    static void motherName() {
        System.out.println("Mother name is Priya.");
    }

    default void motherOccupation() {
        System.out.println("Mother is doctor.");
    }

    default void love() {
        System.out.println("A mother loves his child more than anyone.");
    }

}
