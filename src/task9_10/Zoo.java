package task9_10;

public class Zoo {
    private Animal[] animals = new Animal[0];
    private int animalCount = 0;

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];

        for (int i = 0; i < animals.length; i++) {
            newAnimals[i] = animals[i];
        }

        animal.setId(animalCount + 1);
        animalCount++;

        newAnimals[newAnimals.length - 1] = animal;

        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void removeAnimal(int id) {
        Animal[] newAnimals = new Animal[animals.length - 1];
        int newIndex = 0;
        boolean found = false;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getId() != id) {
                newAnimals[newIndex] = animals[i];
                newIndex++;
            } else {
                found = true;
            }
        }

        if (found) {
            animals = newAnimals;
            System.out.println("Животное ID=" + id + " удалено");
        } else {
            System.out.println("Животное ID=" + id + " не найдено");
        }
    }

    public void printAllAnimals() {
        System.out.println("Зоопарк:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}