package task20;

import java.util.*;
import java.util.concurrent.*;

/**
Запустить 10 задач параллельно в пуле из 3 потоков.
 Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */
public class Main {

    // метод для выполнения задачи генерации файлов
    private static void executeFileGeneratorTask() {
        // Выводим заголовок программы

        System.out.println("Запуск 10 задач в пуле из 3 потоков\n");

        // Создаём ExecutorService с пулом из 3 потоков
        // newFixedThreadPool(3) создаёт ровно 3 потока для обработки задач
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // Создаём список для хранения Future-объектов всех задач
        List<Future<List<String>>> futures = new ArrayList<>();

        // Цикл для отправки 10 задач в пул потоков
        for (int i = 1; i <= 10; i++) {
            // Создаём новую задачу FileGeneratorTask с ID и директорией
            // executor.submit() отправляет задачу в пул и возвращает Future
            Future<List<String>> future = executor.submit(
                    new FileGeneratorTask(i, "generated_files")
            );
            // Добавляем Future в список для последующей обработки результатов
            futures.add(future);
        }

        // Выводим сообщение о том, что все задачи отправлены
        System.out.println("\n=== Все задачи отправлены в пул ===\n");

        // Выводим заголовок для раздела результатов
        System.out.println("=== Результаты выполнения задач ===\n");

        // Переменная для нумерации задач при выводе результатов
        int taskNumber = 1;
        // Итерируем по списку Future-объектов
        for (Future<List<String>> future : futures) {
            try {
                // future.get() ждёт завершения задачи и возвращает результат (блокирующая операция)
                List<String> fileNames = future.get();

                // Выводим номер задачи
                System.out.println("Задача #" + taskNumber + " -> Созданные файлы:");
                // Для каждого имени файла выводим строку с галочкой
                fileNames.forEach(fileName ->
                        System.out.println("  ✓ " + fileName)
                );
                // Добавляем пустую строку для форматирования вывода
                System.out.println();

                // Увеличиваем счётчик задач
                taskNumber++;
            } catch (InterruptedException e) {
                // Если поток был прерван во время ожидания результата
                System.err.println("Задача была прервана: " + e.getMessage());
                e.printStackTrace();
            } catch (ExecutionException e) {
                // Если задача выбросила исключение при выполнении
                System.err.println("Ошибка при выполнении задачи: " + e.getMessage());
                e.printStackTrace();
            }
        }

        // Инициируем выключение пула: новые задачи не принимаются, существующие выполняются
        executor.shutdown();
        // Выводим сообщение об окончании выполнения
        System.out.println("=== Все задачи завершены ===");
    }

    // Точка входа программы
    public static void main(String[] args) {
        // Вызываем метод выполнения задачи генерации файлов
        executeFileGeneratorTask();
    }
}