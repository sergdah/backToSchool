package task17;

import java.io.*;
import java.nio.file.Paths;

/**1.1 Записать его в файл,  прописав относительный путь. Реализуйте соответствующий метод в классе Main.
 1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
 1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main
 1.4 Вычитать текст из второго файла Реализуйте соответствующий метод в классе Main
 2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
 Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).
 В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main
 2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main
*/

public class Main {

    private static final String TEXT = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";

    public static void main(String[] args) {

        // 1.1 1.2
        writeToFile();

        // 1.3 Чтение из 1.1
        readFromRelativePath();

        // 1.4 Чтение из 1.2
        readFromAbsolutePath();

        // 2.1 Сериализация Car
        serializeCar();

        // 2.2 Десериализация Car
        deserializeCar();
    }

    // 1.1
    private static void writeToFile() {
        String path = "relative_text.txt";
        String absolutePath = "/tmp/absolute_text.txt";  // Для Mac

        try (FileWriter writer = new FileWriter(path)) {
            writer.write(TEXT);
            System.out.println("Текст записан в файл relative_text.txt с относительным путём  в папку Идеа ");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileWriter writer = new FileWriter(absolutePath)) {
            writer.write(TEXT);
            System.out.println("Текст записан в файл с абсолютным путём: " + absolutePath);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static void readFromRelativePath() {
        String relativePath = "relative_text.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(relativePath))) {
            System.out.println("Чтение из файла (относительный путь): " + relativePath);
            System.out.println("Содержимое:");
            System.out.println("---");

            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            System.out.println(content.toString());
            System.out.println("---");

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void readFromAbsolutePath() {
        String absolutePath = "/tmp/absolute_text.txt";  // Для Mac

        try (BufferedReader reader = new BufferedReader(new FileReader(absolutePath))) {
            System.out.println("Чтение из файла (абсолютный путь): " + absolutePath);
            System.out.println("Содержимое:");
            System.out.println("---");

            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            System.out.println(content.toString());
            System.out.println("---");

        } catch (IOException e) {
            System.out.println(" Ошибка при чтении файла: " + e.getMessage());
        }
    }


    private static void serializeCar() {

        Car car = new Car("Рено Дастер", 150, "Румыния");
        System.out.println("Объект до сериализации: " + car);

        // Путь для сохранения сериализованного объекта
        String serializationPath = "car.ser";

        // Try-with-resources: автоматически закроет потоки
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(serializationPath))) {

            // Сохраняем объект car в файл
            oos.writeObject(car);
            System.out.println(" Объект Car сериализован и сохранён в: " + serializationPath);

        } catch (IOException e) {
            System.out.println(" Ошибка при сериализации: " + e.getMessage());
        }
    }

    // ===== 2.2: ДЕСЕРИАЛИЗАЦИЯ ОБЪЕКТА CAR =====
    private static void deserializeCar() {
        String serializationPath = "car.ser";

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(serializationPath))) {

            // Восстанавливаем объект из файла
            Car deserializedCar = (Car) ois.readObject();

            System.out.println(" Объект Car десериализован из: " + serializationPath);
            System.out.println(" Объект Car после десериализации: " + deserializedCar);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Ошибка при десериализации: " + e.getMessage());
        }
    }
}
