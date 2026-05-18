package task5;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)
        System.out.println("1) Числа от 1 до 100, кратные 3 или 7:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("********************************");

        // 2. 2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого. (Используйте цикл while).
        // Подсказка. До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.
        System.out.println("2) Введите два положительных целых числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int minNumber;
        int maxNumber;

        if (a > b) {
            minNumber = b;
            maxNumber = a;
        } else {
            minNumber = a;
            maxNumber = b;
        }
        int temp = minNumber;
        while (temp <= maxNumber) {
            sum += temp;
            temp++;
        }
        System.out.println("Сумма чисел от " + minNumber + " до " + maxNumber + " = " + sum);
        System.out.println("***************************");

        // 3*. Ввести число с консоли, которое не заканчивается на 0.Вывести число в обратном порядке. Использовать оператор %.
        System.out.println("Введите целое число,которое не заканчивается на 0:");
        int number = sc.nextInt();
        int digit = 0;
        System.out.print("Обратное число: ");

        while (number > 0) {
            digit = number % 10;     // Получаем последнюю цифру
            System.out.print(digit); //Печатаем последнюю цифру
            number /= 10;            //Отбрасываем последнюю цифру
        }
        System.out.println();
        System.out.println("***************************");


        // 4*. Ввести число с консоли, которое не заканчивается на 0.Вывести его чётные и нечётные ЦИФРЫ через while and if. Использовать оператор %.
        System.out.println("4) Введите целое число которое не заканчивается на 0:");
        int number2 = sc.nextInt();
        int digit2;
        int temp2 = number2;

        System.out.print("Чётные цифры: ");
        while (temp2 > 0) {
            digit2 = temp2 % 10; // Получаем последнюю цифру
            if (digit2 % 2 == 0) {
                System.out.print(digit2 + ", "); //Выводим если четная
            }
            temp2 /= 10; //Отбрасываем ее
        }
        System.out.println();

        System.out.print("Нечётные цифры: "); //Аналогично
        temp2 = number2;
        while (temp2 > 0) {
            digit2 = temp2 % 10;
            if (digit2 % 2 != 0) {
                System.out.print(digit2 + " ");
            }
            temp2 /= 10;
        }
        System.out.println();
        System.out.println("***************************");
    }
}
