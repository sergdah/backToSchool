package task12;
/*
Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle (транспорт)
1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle
1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle.
1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства.
(Boolean isEntryPermitted()); Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.
1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд
транспортного средства в гараж.
*/

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 50);
        Motobike moto = new Motobike("Java 200", 100);

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motobike> motoGarage = new Garage<>(moto);

        System.out.println("Vehicle: " + carGarage.getVehicle().getName() + ", entry permitted? - " + carGarage.isEntryPermitted());

        System.out.println("Vehicle: " + motoGarage.getVehicle().getName() + ", entry permitted? - " + motoGarage.isEntryPermitted());
    }
}