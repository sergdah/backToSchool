package task19;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static List<City> createCities() {
        System.out.println(" 1.1 Создание городов ");

        List<City> cities = Arrays.asList(
                new City(1, "Минск", 1615000, Continent.EUROPE),
                new City(2, "Лондон", 9002488, Continent.EUROPE),
                new City(3, "Париж", 2165423, Continent.EUROPE),
                new City(4, "Берлин", 3645000, Continent.EUROPE),
                new City(5, "Токио", 37400068, Continent.ASIA),
                new City(6, "Пекин", 21540000, Continent.ASIA),
                new City(7, "Дели", 32941000, Continent.ASIA),
                new City(8, "Шанхай", 27058000, Continent.ASIA),
                new City(9, "Каир", 21750000, Continent.AFRICA),
                new City(10, "Лагос", 15000000, Continent.AFRICA),
                new City(11, "Нью-Йорк", 8336817, Continent.NORTH_AMERICA),
                new City(12, "Мехико", 21581000, Continent.NORTH_AMERICA),
                new City(13, "Сан-Паулу", 12252000, Continent.SOUTH_AMERICA),
                new City(14, "Рио-де-Жанейро", 6748000, Continent.SOUTH_AMERICA),
                new City(15, "Сидней", 5312163, Continent.AUSTRALIA)
        );

        cities.forEach(System.out::println);
        System.out.println();

        return cities;
    }

    private static void task1_2(List<City> cities) {
        System.out.println(" 1.2 Самый густонаселённый город в Европе (filter + max) \n");

        Optional<City> densestEurope = cities.stream()
                .filter(c -> c.getContinent() == Continent.EUROPE)
                .max(Comparator.comparingLong(City::getPopulation));

        if (densestEurope.isPresent()) {
            System.out.println("Результат: " + densestEurope.get());
        }
        System.out.println();
    }

    private static void task1_3(List<City> cities) {
        System.out.println(" 1.3 Город с минимальным населением в Азии (filter + min) \n");

        Optional<City> minAsia = cities.stream()
                .filter(c -> c.getContinent() == Continent.ASIA)
                .min(Comparator.comparingLong(City::getPopulation));

        if (minAsia.isPresent()) {
            System.out.println("Результат: " + minAsia.get());
        }
        System.out.println();
    }

    private static void task1_4(List<City> cities) {
        System.out.println(" 1.4 Самый густонаселённый город в мире (max) \n");

        Optional<City> densestWorld = cities.stream()
                .max(Comparator.comparingLong(City::getPopulation));

        if (densestWorld.isPresent()) {
            System.out.println("Результат: " + densestWorld.get());
        }
        System.out.println();
    }

    private static void task1_5(List<City> cities) {
        System.out.println(" 1.5 Город с минимальным населением в мире (min) \n");

        Optional<City> minWorld = cities.stream()
                .min(Comparator.comparingLong(City::getPopulation));

        if (minWorld.isPresent()) {
            System.out.println("Результат: " + minWorld.get());
        }
        System.out.println();
    }

    private static void task1_6(List<City> cities) {
        System.out.println(" 1.6 Первый город с населением > 1 млн (filter + findFirst) \n");

        Optional<City> firstMillionCity = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .findFirst();

        if (firstMillionCity.isPresent()) {
            System.out.println("Результат: " + firstMillionCity.get());
        }
        System.out.println();
    }

    private static void task1_7(List<City> cities) {
        System.out.println(" 1.7 Все города с населением > 1 млн (filter) \n");

        List<City> millionCities = cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .collect(Collectors.toList());

        System.out.println("Найдено городов: " + millionCities.size());
        millionCities.forEach(System.out::println);
        System.out.println();
    }

    private static void task1_8(List<City> cities) {
        System.out.println(" 1.8 Коллекция названий городов (map) \n");

        List<String> cityNames = cities.stream()
                .map(City::getName)
                .collect(Collectors.toList());

        System.out.println("Названия городов: " + cityNames);
        System.out.println();
    }

    public static void main(String[] args) {
        List<City> cities = createCities();

        task1_2(cities);
        task1_3(cities);
        task1_4(cities);
        task1_5(cities);
        task1_6(cities);
        task1_7(cities);
        task1_8(cities);
    }
}
