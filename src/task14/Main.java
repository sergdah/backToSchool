package task14;

public class Main {
    public static void main(String[] args) {
        // Создаем отделение
        Department department = new Department("Терапевтическое отделение");

        // Создаем палаты
        Ward maleWard1 = new Ward("101", RoomType.MALE_ROOM);
        Ward femaleWard1 = new Ward("102", RoomType.FEMALE_ROOM);

        department.getWards().add(maleWard1);
        department.getWards().add(femaleWard1);

        // 1.1. Создаем пациентов
        Patient p1 = new Patient("P001", "Игорь", "Петров", "Грипп", 30, Gender.MALE);
        Patient p2 = new Patient("P002", "Олег", "Иванов", "Грипп", 45, Gender.MALE);
        Patient p3 = new Patient("P003", "Дмитрий", "Сидоров", "Грипп", 22, Gender.MALE);

        // Четвертый пациент для проверки лимита (макс 3 человека)
        Patient p4 = new Patient("P004", "Антон", "Смирнов", "Грипп", 28, Gender.MALE);

        // Пациент с другим диагнозом
        Patient p5 = new Patient("P005", "Вадим", "Сергеев", "Ангина", 35, Gender.MALE);

        // Женщины
        Patient p6 = new Patient("P006", "Анна", "Кузнецова", "ОРВИ", 25, Gender.FEMALE);

        // 1.4 & 1.6 Распределяем по палатам с помощью созданного метода
        System.out.println("--- Наполнение мужской палаты №101 ---");
        maleWard1.addPatientByDiagnosis(p1);
        maleWard1.addPatientByDiagnosis(p2);
        maleWard1.addPatientByDiagnosis(p3);

        // Проверка лимита палаты (Должна быть ошибка: нет свободных мест)
        maleWard1.addPatientByDiagnosis(p4);

        // Проверка дубликата с одинаковыми полями (Должна быть ошибка дубликата благодаря equals)
        Patient duplicateP1 = new Patient("P001", "Игорь", "Петров", "Грипп", 30, Gender.MALE);
        maleWard1.addPatientByDiagnosis(duplicateP1);

        // Проверка палаты №102 (размещение женщин и сверка диагнозов)
        System.out.println("\n--- Наполнение женской палаты №102 ---");
        femaleWard1.addPatientByDiagnosis(p6);

        // Попытка положить мужчину с другим диагнозом в женскую палату (Две ошибки сразу)
        femaleWard1.addPatientByDiagnosis(p5);

        // 1.7. Вывод информации по палатам
        System.out.println();
        maleWard1.printPatientsInfo();
        femaleWard1.printPatientsInfo();

        // 1.5. Считаем количество мужчин и женщин в отделении
        System.out.println();
        department.countGenders();
    }
}