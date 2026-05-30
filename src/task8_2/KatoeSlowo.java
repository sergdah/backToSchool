package task8_2;

public class KatoeSlowo {
    /*
     2. Дан текст:
     "Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку,
     является экземпляром класса String. Особенностью объекта класса String является то,
     что его значение не может быть изменено после создания объекта при помощи любого метода класса.
     Изменение строки всегда приводит к созданию нового объекта в heap.
     Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке.
     Произведенные изменения можно сохранить переинициализируя ссылку."
     2.1 В тексте после символа каждого слова с индексом k вставить заданную подстроку. Используемые методы (split(), substring())
     Вынести это в отдельный метод с сигнатурой public String (int k, String text)
     */
    public String insertAfterKthWord(int k, String text) {
        String substring = " *пииип* ";

        String[] words = text.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            result = result + words[i];
            if ((i + 1) % k == 0) {
                result = result + substring;
            } else {
                if (i < words.length - 1) {
                    result = result + " ";
                }
            }
        }

        return result;
    }

}