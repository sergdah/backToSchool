package task11;

public class RobotBuilder implements RobotEngineer {
    String model;
    int power;
    String country;
    String buildingUnit;
    String material;
    boolean isOn;

    public RobotBuilder(String model, int power, String country, String buildingUnit, String material) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.buildingUnit = buildingUnit;
        this.material = material;
        this.isOn = true;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(model + " builder now ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(model + " builder now OFF");
    }

    @Override
    public void uniquePossibility() {
        if (!isOn) System.out.println(model + " inactive — turn it on");
        else System.out.println(model + " mix concrete");
    }

    @Override
    public void createItem() {
        System.out.println(model + " build house");
    }
}
