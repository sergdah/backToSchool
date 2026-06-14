package task9;

public class Bird extends Animal {
    private String family;
    private double maxFlightHeight;

    public Bird(String color, int maxLifespan, String foodType,
                String family, double maxFlightHeight) {
        super(color, maxLifespan, foodType);
        this.family = family;
        this.maxFlightHeight = maxFlightHeight;
    }

    public void sing() {
        System.out.println(family + " поёт");
    }

    public void cluck() {
        System.out.println(family + " блюёт");
    }

    public void breedChicks() {
        System.out.println(family + " высиживает птенцов");
    }

    @Override
    public void makeSound() {
        System.out.println(family + " чирикает");
    }

    @Override
    public void play() {
        System.out.println(family + " играет");
    }

    public String getFamily() {
        return family;
    }

    public double getMaxFlightHeight() {
        return maxFlightHeight;
    }

    @Override
    public String toString() {
        return "Bird:" +
                " family=" + family  +
                " maxFlightHeight=" + maxFlightHeight +
                " color=" + getColor() +
                " maxLifespan=" + getMaxLifespan() +
                " foodType=" + getFoodType()  +
                " id=" + getId();
    }
}