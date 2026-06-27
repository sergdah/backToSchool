package task14;

import java.util.Objects;

public class Patient {
    private final String id; // Уникальный идентификатор
    private String firstName;
    private String lastName;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(String id, String firstName, String lastName, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    // Переопределение equals и hashCode для предотвращения дубликатов (пункт 1.4)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id, patient.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Геттеры и сеттеры
    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    @Override
    public String toString() {
        return String.format("[%s] %s %s (%s, %d лет, пол: %s)",
                id, firstName, lastName, diagnosis, age, gender.getDescription());
    }
}
