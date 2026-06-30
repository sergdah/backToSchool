package task14;

/**
 * 1. Создать класс пациент, палата, отделение.
 * 1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).
 * 1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
 * 1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
 * 1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум.
 * При этом попробуйте добавит двух пациентов, с одинаковыми полями.
 * Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode. Палаты распределить по отделениям.
 * 1.5 Посчитать количество мужчин и женщин в отделении.
 * 1.6 Реализовать метод добавления пациента в палату на основе диагноза. Т.е, в палате должны лежать пациенты с одинаковыми диагнозами.
 * Метод реализовать в классе Палата.
 * 1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.
 */

public class Main {
    public static void main(String[] args) {
        // Создаем отделение
        Department department = new Department("Терапевтическое отделение");

        // Создаем палаты
        Ward maleWard1 = new Ward("101", RoomType.MALE_ROOM);
        Ward femaleWard1 = new Ward("102", RoomType.FEMALE_ROOM);

        department.getWards().add(maleWard1);
        department.getWards().add(femaleWard1);

        Patient p1 = new Patient("P001", "Игорь", "Петров", "Грипп", 30, Gender.MALE);
        Patient p2 = new Patient("P002", "Олег", "Иванов", "Грипп", 45, Gender.MALE);
        Patient p3 = new Patient("P003", "Дмитрий", "Сидоров", "Грипп", 22, Gender.MALE);

        Patient p4 = new Patient("P004", "Антон", "Смирнов", "Грипп", 28, Gender.MALE);

        // Пациент с другим диагнозом
        Patient p5 = new Patient("P005", "Вадим", "Сергеев", "Ангина", 35, Gender.MALE);

        // Женщины
        Patient p6 = new Patient("P006", "Анна", "Кузнецова", "ОРВИ", 25, Gender.FEMALE);

        System.out.println("Наполнение мужской палаты");
        maleWard1.addPatientByDiagnosis(p1);
        maleWard1.addPatientByDiagnosis(p2);
        maleWard1.addPatientByDiagnosis(p3);

        // Проверка лимита палаты
        maleWard1.addPatientByDiagnosis(p4);

        // Проверка дубликата с одинаковыми полями
        Patient duplicateP1 = new Patient("P001", "Игорь", "Петров", "Грипп", 30, Gender.MALE);
        maleWard1.addPatientByDiagnosis(duplicateP1);

        // Проверка палаты
        System.out.println("Женская палата");
        femaleWard1.addPatientByDiagnosis(p6);

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