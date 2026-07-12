package task18;
public class Main {
/*
1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки. Определить в нём метод, при котором авто будет просто ехать
(выводить в консоль сообщение в цикле).
1.1 Создать два потока (две машины которые будут ехать параллельно). Потоки запускайте в классе Main.
Выносите методы в private static void согласно заданиям.
1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep).
Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки).
В последствии поток будет спать переданное время.
1.3 Запустить три потока с машинами. При этом 2 машины начнут двигаться только после того, как 1 машина прекратит езду (прекратит выполнение потока)
(метод join)
    */
    private static void twoParallelStreams() {


        Car car1 = new Car("Дастер", "A001AA-8", 500);
        Car car2 = new Car("Tatra", "B002BB-9", 500);

        Thread thread1 = new Thread(car1::drive);
        Thread thread2 = new Thread(car2::drive);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Задача 1.1 завершена");
    }

    // Задача 1.2: Машины с разным временем остановки
    private static void task1_2() {
        System.out.println("=== Задача 1.2: Машины с разными временами остановки ===\n");

        Car car1 = new Car("Audi", "C003CC", 1000);
        Car car2 = new Car("Tesla", "D004DD", 2000);

        Thread thread1 = new Thread(car1::drive);
        Thread thread2 = new Thread(car2::drive);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Задача 1.2 завершена\n");
    }

    // Задача 1.3: Три потока с использованием join
    private static void task1_3() {
        System.out.println("=== Задача 1.3: Три машины (вторая и третья начинают после первой) ===\n");

        Car car1 = new Car("Lamborghini", "E005EE", 800);
        Car car2 = new Car("Ferrari", "F006FF", 600);
        Car car3 = new Car("Porsche", "G007GG", 500);

        Thread thread1 = new Thread(car1::drive);
        Thread thread2 = new Thread(car2::drive);
        Thread thread3 = new Thread(car3::drive);

        // Запускаем первую машину
        thread1.start();

        try {
            // Ждём завершения первой машины
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n>>> Первая машина завершила езду, запускаем вторую и третью <<<\n");

        // Теперь запускаем вторую и третью параллельно
        thread2.start();
        thread3.start();

        try {
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Задача 1.3 завершена\n");
    }

    public static void main(String[] args) {
        twoParallelStreams();
        task1_2();
        task1_3();
    }
}