package task11;

public class RobotCooker implements Robot {
    String model;
    int power;
    String country;
    String cookingItem;
    boolean isOn;

    RobotCooker(String model, int power, String country, String cookingItem) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.cookingItem = cookingItem;
        this.isOn = false;
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
        else System.out.println(model + " cooks");
    }

    @Override
    public String toString() {
        return "RobotCooker{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", country='" + country + '\'' +
                ", cookingAgregat='" + cookingItem + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
