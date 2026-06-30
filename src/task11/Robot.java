package task11;

public interface Robot {

    void turnOn();
    void turnOff();
    void uniquePossibility();

    default void repair() {
        System.out.println("Robot repaired");
    }
}
