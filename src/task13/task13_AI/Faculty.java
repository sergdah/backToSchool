package task13.task13_AI;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Group> groups;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.groups = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public String getFacultyName() { return facultyName; }
    public void setFacultyName(String facultyName) { this.facultyName = facultyName; }

    public List<Group> getGroups() { return groups; }
    public void setGroups(List<Group> groups) { this.groups = groups; }

    @Override
    public String toString() {
        return "Факультет: " + facultyName + "\nГруппы:\n" + groups;
    }
}
