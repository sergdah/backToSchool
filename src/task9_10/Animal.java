package task9_10;

public class Animal {
    private String color;
    private int maxLifespan;
    private String foodType;
    private int id;

    public Animal(String color, int maxLifespan, String foodType) {
        this.color = color;
        this.maxLifespan = maxLifespan;
        this.foodType = foodType;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void play() {
        System.out.println("Животное играет");
    }

    public String getColor() {
        return color;
    }

    public int getMaxLifespan() {
        return maxLifespan;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal: color" + color + " maxLifespan=" + maxLifespan + " foodType=" + foodType +
                " id=" + id;
    }
}
