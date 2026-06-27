package task13.task13_AI;

public class Main {
    public static void main(String[] args) {
        // 1.1. Создаем студентов
        Student s1 = new Student("Иван", "Иванов", "2005-05-12", "Минск", 8);
        Student s2 = new Student("Анна", "Петрова", "2006-01-20", "Витебск", 4);
        Student s3 = new Student("Сергей", "Сидоров", "2005-11-02", "Гродно", 9);
        Student s4 = new Student("Ольга", "Козлова", "2005-08-15", "Брест", 5);

        // 1.2. Создаем группы и распределяем студентов методом add
        Group g1 = new Group("ПОИТ-11");
        g1.getStudents().add(s1);
        g1.getStudents().add(s2);
        g1.getStudents().add(s3);

        Group g2 = new Group("ПОИТ-12");
        g2.getStudents().add(s4); // В этой группе остался 1 студент

        // 1.3. Создаем Факультет и добавляем туда группы
        Faculty faculty = new Faculty("Факультет Информационных Технологий");
        faculty.getGroups().add(g1);
        faculty.getGroups().add(g2);

        System.out.println("--- Исходные данные ---");
        System.out.println(faculty);

        // 1.6. Проверяем подсчет среднего балла по группе до изменений
        System.out.println("\n--- Проверка среднего балла (1.6) ---");
        System.out.printf("Средний балл группы %s: %.2f\n", g1.getGroupNumber(), g1.calculateAverageGroupMark());

        // 1.4. Удаляем студентов из первой группы с баллом ниже 6 (Анна Петрова с баллом 4 удалится)
        System.out.println("\n--- Удаление студентов с баллом ниже 6 (1.4) ---");
        g1.removeStudentsByMark(6);
        System.out.println(g1);

        // 1.5. Проверяем перевод студентов (в g2 всего 1 человек, значит сработает перевод в g1)
        System.out.println("\n--- Проверка перевода студентов из малочисленной группы (1.5) ---");
        g2.transferToGroup(g1);

        System.out.println("\n--- Данные факультета после всех манипуляций ---");
        System.out.println(faculty);
    }
}
