package task13.task13_AI;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupNumber;
    private List<Student> students;

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>(); // Инициализируем пустой список
    }

    // 1.4. Удаление студентов с баллом ниже переданного
    public void removeStudentsByMark(int mark) {
        students.removeIf(student -> student.getAverageMark() < mark);
    }

    // 1.5. Перевод студентов, если в группе меньше 2 человек
    public void transferToGroup(Group newGroup) {
        if (this.students.size() < 2) {
            newGroup.getStudents().addAll(this.students); // Добавляем всех в новую группу
            this.students.clear(); // Очищаем старую группу
            System.out.println("Группа " + this.groupNumber + " расформирована. Студенты переведены.");
        } else {
            System.out.println("В группе " + this.groupNumber + " достаточно человек. Перевод не требуется.");
        }
    }

    // 1.6. Расчет среднего балла по группе
    public double calculateAverageGroupMark() {
        if (students.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Student student : students) {
            sum += student.getAverageMark();
        }
        return (double) sum / students.size();
    }

    // Геттеры и сеттеры
    public String getGroupNumber() { return groupNumber; }
    public void setGroupNumber(String groupNumber) { this.groupNumber = groupNumber; }

    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }

    @Override
    public String toString() {
        return "Группа " + groupNumber + " " + students;
    }
}
