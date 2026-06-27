package task14;

import java.util.ArrayList;
import java.util.List;

public class Ward {
    private String roomNumber;
    private RoomType roomType;
    private List<Patient> patients;

    public Ward(String roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.patients = new ArrayList<>();
    }

    // 1.6. Метод добавления пациента на основе диагноза и ограничений (пол, лимит 3 человека)
    public boolean addPatientByDiagnosis(Patient patient) {
        // Проверка лимита в 3 человека (пункт 1.4)
        if (patients.size() >= 3) {
            System.out.println("Ошибка: В палате №" + roomNumber + " нет свободных мест (макс. 3).");
            return false;
        }

        // Проверка соответствия пола пациента типу палаты
        if ((patient.getGender() == Gender.MALE && roomType != RoomType.MALE_ROOM) ||
                (patient.getGender() == Gender.FEMALE && roomType != RoomType.FEMALE_ROOM)) {
            System.out.println("Ошибка: Нельзя положить пациента в палату чужого пола.");
            return false;
        }

        // Проверка дубликата по equals/hashCode (пункт 1.4)
        if (patients.contains(patient)) {
            System.out.println("Ошибка: Пациент с ID " + patient.getId() + " уже находится в этой палате!");
            return false;
        }

        // Проверка диагноза (пункт 1.6): если палата не пуста, диагноз должен совпадать
        if (!patients.isEmpty()) {
            String existingDiagnosis = patients.get(0).getDiagnosis();
            if (!existingDiagnosis.equalsIgnoreCase(patient.getDiagnosis())) {
                System.out.println("Ошибка: Диагноз '" + patient.getDiagnosis() +
                        "' не совпадает с профилем палаты №" + roomNumber + " ('" + existingDiagnosis + "').");
                return false;
            }
        }

        // Если все проверки пройдены — добавляем
        patients.add(patient);
        return true;
    }

    // 1.7. Метод вывода информации по всем пациентам в палате
    public void printPatientsInfo() {
        System.out.println("--- Пациенты в палате №" + roomNumber + " (" + roomType.getDescription() + ") ---");
        if (patients.isEmpty()) {
            System.out.println("Палата пуста.");
        } else {
            for (Patient p : patients) {
                System.out.println(p);
            }
        }
    }

    // Геттеры и сеттеры
    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public RoomType getRoomType() { return roomType; }
    public void setRoomType(RoomType roomType) { this.roomType = roomType; }
    public List<Patient> getPatients() { return patients; }
    public void setPatients(List<Patient> patients) { this.patients = patients; }
}
