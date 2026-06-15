package task9_10;

public class Dog extends Animal {
    private String name;
    private String breed;
    private double averageWeight;

    public Dog(String color, int maxLifespan, String foodType,
               String name, String breed, double averageWeight) {
        super(color, maxLifespan, foodType);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    public void bark() {
        System.out.println(name + " лает");
    }

    public void bite() {
        System.out.println(name + " кусает");
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " издает звук");
    }

    @Override
    public void play() {
        System.out.println(name + " играет");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    @Override
    public String toString() {
        return "Dog:" +
                " name=" + name +
                " breed=" + breed +
                " averageWeight=" + averageWeight +
                " color=" + getColor() +
                " maxLifespan=" + getMaxLifespan() +
                " foodType=" + getFoodType() +
                " id=" + getId();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        return getId() == dog.getId() &&
                dog.averageWeight == averageWeight &&
                name.equals(dog.name) &&
                breed.equals(dog.breed) &&
                getColor().equals(dog.getColor()) &&
                getMaxLifespan() == dog.getMaxLifespan() &&
                getFoodType().equals(dog.getFoodType());
    }

    @Override
    public int hashCode() {
        // Используем Objects.hash() для генерации хеша на основе полей
        return java.util.Objects.hash(getId(), name, breed, averageWeight,
                getColor(), getMaxLifespan(), getFoodType());
    }
}