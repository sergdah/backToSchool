package task17;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    // serialVersionUID - идентификатор версии класса для сериализации
    private static final long serialVersionUID = 1L;

    private String brand;
    private int maxSpeed;
    private String countryOfOrigin;

    public Car(String brand, int maxSpeed, String countryOfOrigin) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return getMaxSpeed() == car.getMaxSpeed() && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getCountryOfOrigin(), car.getCountryOfOrigin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getMaxSpeed(), getCountryOfOrigin());
    }
}
