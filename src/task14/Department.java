package task14;

import java.util.HashSet;
import java.util.Set;

public class Department {
    private String departmentName;
    private Set<Ward> wards;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.wards = new HashSet<>();
    }

    // 1.5. Подсчет количества мужчин и женщин в отделении
    public void countGenders() {
        int maleCount = 0;
        int femaleCount = 0;

        for (Ward ward : wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getGender() == Gender.MALE) {
                    maleCount++;
                } else if (patient.getGender() == Gender.FEMALE) {
                    femaleCount++;
                }
            }
        }

        System.out.println("Статистика по отделению '" + departmentName);
        System.out.println("Мужчин: " + maleCount);
        System.out.println("Женщин: " + femaleCount);
    }

    // Геттеры и сеттеры
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public Set<Ward> getWards() { return wards; }
    public void setWards(Set<Ward> wards) { this.wards = wards; }
}