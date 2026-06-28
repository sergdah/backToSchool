package task13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // students
        List<Student> students1 = new ArrayList<>(List.of(
                new Student("Люся", "Ивановская", "12.08.2001", "Плюсы", 5.0),
                new Student("Аннита", "Петрович", "12.08.2002", "Браслав", 4.0)

        ));
        List<Student> students2 = new ArrayList<>(List.of(
                new Student("Сирожа", "Маладэц", "12.08.2001", "Краслава", 7.0),
                new Student("Лена", "Головач", "12.08.2000", "Гродно", 8.0)
        ));

        // groups
        List<Group> groups = new ArrayList<>(List.of(
                new Group("ПcИТ-11", students1),
                new Group("Verbal78", students2)
        ));


        // faculty
//        Faculty faculty = new Faculty(List.of(
//                new Faculty("КТФ", groups)
//        ));


        // Проверка: выведем структуру в консоль
//        System.out.println("Факультет: " + faculty.getFacultyName());
//        for (Group group : faculty.getGroups()) {
//            System.out.println("  Группа: " + group.getGroupNumber());
//            for (Student student : group.getStudents()) {
//                System.out.println("    Студент: " + student.getFirstName() + " " + student.getLastName() + ", Средний балл: " + student.getAverageMark());
//            }
    }
}