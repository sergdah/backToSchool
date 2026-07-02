package task15;

/**
 * 1.1.Создать класс. Сотрудник.
 * 1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.
 * 1.3.Создать сотрудников (создайте штук восемь)
 * 1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.
 * 1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии. Сигнатура метода к примеру такая.
 * private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease).
 * Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Ardsen", "Fuckson", 28, 500);
        Employee employee2 = new Employee(2, "Mary", "Валюкс", 32, 550);
        Employee employee3 = new Employee(3, "Грэг", "Хауз", 49, 5020);
        Employee employee4 = new Employee(4, "Анна", "Смирнова-Закаваркина", 27, 480);
        Employee employee5 = new Employee(5, "Сэргэй", "Волкович", 40, 600);
        Employee employee6 = new Employee(6, "Еленай", "Павлова", 29, 510);
        Employee employee7 = new Employee(7, "Васян", "Сварщиков", 45, 6500);
        Employee employee8 = new Employee(8, "Ольга", "Дворничхина", 31, 100);
//        Map<Integer, String> map = new HashMap<>();
//        map.put(0, "перв");
//        map.put(1, "второй");
//        map.put(2, "третий");
//        map.put(3, "четверты");
//        map.put(4, "пяты");
//        map.put(5, "шесты");
//        map.put(6, "сёмы");
//        map.put(7, "восьмы");

        Map<Employee,String> employees = new LinkedHashMap<>();

       employees.put(employee1, "Fisher");
        employees.put(employee2, "Электрик");
        employees.put(employee3, "Диагност");
        employees.put(employee4, "Плотник");
        employees.put(employee5, "Заместитель");
        employees.put(employee6, "Зиц-председатель");
        employees.put(employee7, "Сварщик");
        employees.put(employee8, "Дворничиха");

//        List<String> newList = new ArrayList<>();
//        for (Map.Entry<Integer, String> thing : map.entrySet()) {
//            if (thing.getKey() > 5) {
//                newList.add(thing.getValue());
//            }
//        }

        System.out.println("З/П");
        for (Map.Entry<Employee, String> smth : employees.entrySet()) {
            System.out.println(smth.getKey() + " профессия: " + smth.getValue());
        }

        raiseSalaryForProfession(employees, "Плотник", 200);

        System.out.println("новые данные по иплоерам");
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " профессия: " + entry.getValue());
        }
    }
    // Мeтод увеличения зп
    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int plusToSalary) {
        // получить проффесию сравнить и повысить
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            Employee employee = entry.getKey();
            String employeeProfession = entry.getValue();

            if (employeeProfession.equals(profession)) {
                employee.setSalary(employee.getSalary() + plusToSalary);
                System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + profession + " зарплата повышена на " + plusToSalary);
            }
        }
    }
}
