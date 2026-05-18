package homework1;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        // 1. На вход даны 3 числа. Вывести в консоль только четные числа
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число a");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b");
        int b = scanner.nextInt();
        System.out.println("Введите целое число c");
        int c = scanner.nextInt();

        System.out.println("Чётные числа:");

        if (a % 2 == 0) {
            System.out.println(a);
        }
        if (b % 2 == 0) {
            System.out.println(b);
        }
        if (c % 2 == 0) {
            System.out.println(c);
        }
*/
        //2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
        // (используйте оператор % для проверки деления без остатка)
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число a");
        int a = scanner.nextInt();
        System.out.println("Введите целое число b");
        int b = scanner.nextInt();
        System.out.println("Введите целое число c");
        int c = scanner.nextInt();

        int[] rowOfNumbers = {a, b, c};

        System.out.println("Из введённых Вами чисел делятся и на 2 и на 5:");
        for (int i = 0; i < 3; i++) {

            if (rowOfNumbers[i] % 10 == 0) {
                System.out.println(rowOfNumbers[i]);
            }

        }*/

        //3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
        //Написать программу, которая будет выводит разный текст, в зависимости от значения result.
        //В случае result=3, вывести: "Результат деления равен 3"
        //В случае result=5 вывести: "Результат деления равен 5"
        //В других случаях вывести: "Результат деления равен дробному числу".
        //При этом в последнем случае вывести точный результат деления (использовать приведение типов)

        System.out.println("Введите число X:");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println("Делить на 0 нельзя");
            return;
        }

        if (15 % x == 0) {
            int result = 15 / x;

            switch (result) {
                case 1:
                    System.out.println("Результат деления равен " + result);
                    break;
                case 3:
                    System.out.println("Результат деления равен " + result);
                    break;
                case 5:
                    System.out.println("Результат деления равен " + result);
                    break;
                case 15:
                    System.out.println("Результат деления равен " + result);
                    break;
                default:
                    System.out.println("Результат деления равен дробному числу");
                    break;
            }
        } else {
            double resultDouble = 15.0 / x;
            System.out.println("Результат деления равен дробному числу " + resultDouble);
        }


    }
}
