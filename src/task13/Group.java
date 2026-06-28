package task13;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupNumber;
    private List<Student> students;

    public Group(String groupNumber, List<Student> students) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public Group(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // 1.2. Добавить студента в группу
    public void addStudent(Student student) {
        students.add(student);
    }

    // 1.4. Удалить студентов с баллом ниже переданного
    public void removeStudentsByMark(int mark) {
        students.removeIf(student -> student.getAverageMark() < mark);
    }

    // 1.5. Перевести студентов в другую группу, если в группе меньше 2 человек
    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.students.addAll(students);
            students.clear();
            System.out.println("Студенты группы " + groupNumber +
                    " переведены в группу " + newGroup.getGroupNumber());
        }
    }
    public double averageGroupMark() {
        // Если студентов в группе нет
        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (Student student : students) {
            sum = sum + student.getAverageMark();
        }
        double averageGroupMark = sum / students.size();
        return averageGroupMark;
    }
}
