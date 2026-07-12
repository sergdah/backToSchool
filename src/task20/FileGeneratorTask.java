package task20;

import java.io.*;
import java.util.*;
import java.util.concurrent.Callable;

//Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно на 1-3 секунды,
//результат выполнения –коллекция имен файлов.

public class FileGeneratorTask implements Callable<List<String>> {

    private int taskId;
    // папка для сохранения файлов
    private String outputDir;

    // Конструктор
    public FileGeneratorTask(int taskId, String outputDir) {
        this.taskId = taskId;
        this.outputDir = outputDir;

        // Создаём объект File для работы с директорией
   //     File dir = new File(outputDir);
        // Проверяем, существует ли директория
   //     if (!dir.exists()) {
            // Если нет, создаём её (mkdirs создаёт все родительские директории)
    //        dir.mkdirs();

    }

    // Метод call() выполняется в отдельном потоке и возвращает результат
    @Override
    public List<String> call() throws Exception {
        // Получаем имя текущего потока для отслеживания выполнения
        String threadName = Thread.currentThread().getName();
        // Создаём список для сохранения имён созданных файлов
        List<String> fileNames = new ArrayList<>();
        // Инициализируем Random для генерации случайных данных
        Random random = new Random();

        // Выводим сообщение о начале выполнения задачи с указанием потока
        System.out.println("[" + threadName + "] Задача #" + taskId + " НАЧАТА");

        // Цикл для создания 10 файлов
        for (int i = 1; i <= 10; i++) {
            // Формируем имя файла с ID задачи и номером файла
            String fileName = "task_" + taskId + "_file_" + i + ".txt";
            // Формируем полный путь к файлу (директория + разделитель + имя файла)
            String filePath = outputDir + File.separator + fileName;

            // Выводим сообщение о создании файла с указанием потока
            System.out.println("[" + threadName + "] Задача #" + taskId +
                    " создаёт файл: " + fileName);

            // Try-with-resources: автоматически закрывает FileWriter после использования
            try (FileWriter writer = new FileWriter(filePath)) {
                // Цикл для записи 10 строк в файл
                for (int j = 1; j <= 10; j++) {
                    // Генерируем случайную строку текста
                    String line = generateRandomString(random);
                    // Записываем в файл: "Строка N: сгенерированный текст" с переводом строки
                    writer.write("Строка " + j + ": " + line + "\n");
                }
            } catch (IOException e) {
                // Если возникла ошибка при создании файла, выводим stack trace
                e.printStackTrace();
            }

            // Добавляем имя файла в список результатов
            fileNames.add(fileName);
        }

        // Выводим сообщение об успешном создании всех файлов для задачи
        System.out.println("[" + threadName + "] Задача #" + taskId +
                " созданы все 10 файлов");

        // Генерируем случайное время сна от 1 до 3 секунд (1 + число от 0 до 2)
        int sleepTime = 1 + random.nextInt(3);
        // Выводим информацию о том, что поток спит если время сна более 0
        if (sleepTime > 0) System.out.println("[" + threadName + "] Задача #" + taskId +
                " спит " + sleepTime + " сек");
        // Переводим секунды в миллисекунды и усыпляем текущий поток
        Thread.sleep(sleepTime * 1000);

        System.out.println("[" + threadName + "] Задача #" + taskId + " ЗАВЕРШЕНА");

        // Возвращаем список имён созданных файлов
        return fileNames;
    }

    //метод для генерации случайной строки из слов
    private String generateRandomString(Random random) {
        // Массив слов для генерации
        String[] words = {
                "Java", "Stream", "API", "Lambda", "Thread", "File", "Data",
                "Program", "Code", "System", "Memory", "Process", "Task", "Queue"
        };

        // StringBuilder используется для построения строки
        StringBuilder sb = new StringBuilder();
        // Определяем случайное количество слов: от 2 до 4
        int wordCount = 2 + random.nextInt(3);

        // Цикл для добавления словc в строку
        for (int i = 0; i < wordCount; i++) {
            // Если это не первое слово, добавляем пробел для разделения
            if (i > 0) sb.append(" ");
            // Выбираем случайное слово из массива и добавляем его
            sb.append(words[random.nextInt(words.length)]);
        }

        // Возвращаем построенную строку
        return sb.toString();
    }
}

