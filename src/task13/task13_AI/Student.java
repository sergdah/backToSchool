package task13.task13_AI;

public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String birthCity;
    private int averageMark;

    // Конструктор для удобного создания объектов
    public Student(String firstName, String lastName, String birthDate, String birthCity, int averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.averageMark = averageMark;
    }

    // Геттеры и сеттеры
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public String getBirthCity() { return birthCity; }
    public void setBirthCity(String birthCity) { this.birthCity = birthCity; }

    public int getAverageMark() { return averageMark; }
    public void setAverageMark(int averageMark) { this.averageMark = averageMark; }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Балл: " + averageMark + ")";
    }
}
