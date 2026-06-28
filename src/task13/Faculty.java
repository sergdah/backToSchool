package task13;

import task13.task13_AI.FacStatus;

import java.util.List;

public class Faculty {
    private String facultyName;
    private List<Group> groups;
    private List<FacStatus> status;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }


    public Faculty(String facultyName, List<Group> groups, List<FacStatus> status) {
        this.facultyName = facultyName;
        this.groups = groups;
        this.status = status;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
