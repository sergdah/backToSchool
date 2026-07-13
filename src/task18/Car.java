package task18;

public class Car {
    private String name;
    private String stateNumber;
    private int stopTime;

    public Car(String name, String stateNumber, int stopTime) {
        this.name = name;
        this.stateNumber = stateNumber;
        this.stopTime = stopTime;
    }

    public void drive() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "  " + stateNumber + " едет...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " остановился на " + stopTime + " мс");
        try {
            Thread.sleep(stopTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " завершил езду");
    }
}