package task9_10;

public class Lion extends Animal {
    private String name;

    public Lion(String color, int maxLifespan, String foodType, String name) {
        super(color, maxLifespan, foodType);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " рычит");
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Lion:" +
                " name=" + name +
                " color=" + getColor() +
                " maxLifespan=" + getMaxLifespan() +
                " foodType=" + getFoodType() +
                " id=" + getId();
    }
}