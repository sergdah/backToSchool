package task9;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        System.out.println("вэлком ту зоопарк:");

        Dog dog1 = new Dog("Бежевая", 15, "корм", "Элли", "golden retriver", 18);
        Dog dog2 = new Dog("Белый", 18, "кости", "Барон", "Лабрадор", 15);
        Dog dog3 = new Dog("Красный", 14, "мясо", "Шарик", "Немецкая овчарка", 20);

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        Bird bird1 = new Bird("Серый", 10, "насекомые", "Воробей", 20);
        Bird bird2 = new Bird("Синий", 12, "насекомые", "Синица", 25);
        Bird bird3 = new Bird("Красный", 15, "семена", "Попугай", 100);

        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        // Три льва
        Lion lion1 = new Lion("yellow", 20, "насекомые", "Симба");
        Lion lion2 = new Lion("gold", 22, "антилопы", "Муфаса");
        Lion lion3 = new Lion("golden", 19, "мясо", "Нала");

        zoo.addAnimal(lion1);
        zoo.addAnimal(lion2);
        zoo.addAnimal(lion3);

        System.out.println("DOGs");
        dog1.bark();
        dog1.bite();
        dog1.run();
        dog1.jump();

        System.out.println("BiRDs");
        bird1.sing();
        bird1.cluck();
        bird1.breedChicks();

        lion1.play();

        System.out.println("Sounds");
        for (Animal animal : zoo.getAnimals()) {
            animal.makeSound();
        }

        System.out.println("Games");
        for (Animal animal : zoo.getAnimals()) {
            animal.play();
        }

        zoo.printAllAnimals();

        System.out.println("Удаление животного с ID=2");
        zoo.removeAnimal(2);

        zoo.printAllAnimals();
    }
}