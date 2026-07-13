package task18;

// Путь: src/runnable/CarRunnable.java

//package runnable;

/**
 * Класс автомобиля, реализующий интерфейс Runnable
 * Это лучшая практика для многопоточности
 */
public class CarRunnable implements Runnable {

    // Поля класса
    private String carName;        // Имя машины
    private String licenseNumber;  // Государственный номер
    private long stopDuration;     // Время остановки в миллисекундах

    // ===== КОНСТРУКТОР =====
    public CarRunnable(String carName, String licenseNumber, long stopDuration) {
        this.carName = carName;
        this.licenseNumber = licenseNumber;
        this.stopDuration = stopDuration;
    }

    // ===== ГЕТТЕРЫ =====
    public String getCarName() {
        return carName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public long getStopDuration() {
        return stopDuration;
    }

    // ===== МЕТОД run() - ОСНОВНОЙ КОД ПОТОКА =====
    // Этот метод выполняется когда вызвали start() у Thread
    @Override
    public void run() {
        System.out.println("🚗 " + carName + " (" + licenseNumber + ") начала движение!");

        // Симуляция движения: машина едет и выводит сообщения
        for (int i = 1; i <= 5; i++) {
            System.out.println("   🚗 " + carName + " едет... км " + (i * 10));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("❌ Машина " + carName + " прервана: " + e.getMessage());
            }
        }

        // Машина останавливается
        System.out.println("🛑 " + carName + " останавливается на " + stopDuration + " мс...");
        try {
            Thread.sleep(stopDuration);
        } catch (InterruptedException e) {
            System.out.println("❌ Машина " + carName + " прервана во время стоп: " + e.getMessage());
        }

        // Машина продолжает ехать после остановки
        for (int i = 6; i <= 10; i++) {
            System.out.println("   🚗 " + carName + " едет дальше... км " + (i * 10));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("❌ Машина " + carName + " прервана: " + e.getMessage());
            }
        }

        System.out.println("✓ " + carName + " (" + licenseNumber + ") завершила движение!");
    }

    // ===== ПЕРЕОПРЕДЕЛЕНИЕ toString() =====
    @Override
    public String toString() {
        return "CarRunnable{" +
                "carName='" + carName + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", stopDuration=" + stopDuration + " мс" +
                '}';
    }
}
