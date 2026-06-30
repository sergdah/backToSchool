package task11;

public class RobotSaper implements RobotEngineer {

    String model;
    int power;
    String vin;
    String material;
    boolean isOn;

    RobotSaper(String model, int power, String vin, String material) {
        this.model = model;
        this.power = power;
        this.vin = vin;
        this.material = material;
        this.isOn = true;
    }

    @Override
    public void createItem() {
        System.out.println(model + " creates tools from " + material + ".");
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " OFF");
    }

    @Override
    public void uniquePossibility() {
        if (!isOn) System.out.println(model + " inactive — turn it on");
        else System.out.println(model + " demining");
    }

    @Override
    public void repair() {
        System.out.println(model + " невозможно восстановить - замена");
    }
}
