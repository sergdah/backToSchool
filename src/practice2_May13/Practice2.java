package practice2_May13;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
//        int a=7;
//        while (a<=98){
//            System.out.println(a+" ");
//            a+=7;
//        }
        //*******************************
//    int a=1, i=0,sum=0;
//    while (i<10){
//        sum= sum+a++;
//        i++;
//    }
//System.out.println("Сумма: " + sum);
//
        //*******************************

//
//        for (int i = 100; i >= 1; i--) {
//            if (i > 1) {
//                System.out.println(i + ",");
//            } else {
//                System.out.println(i);
//            }
//        }
        //*******************************
//
//
//        for (int i = 0; i <= 101; i+=10) {
//
//            System.out.println(i + " ");
//
//        }
        //*******************************


//        for (int i = 1; i < 100; i++) {
//if (i%2 ==0) {
//            System.out.println(i + " ");
//
//        }}
        //*******************************
//        int a;
//        int[] array = new int[100];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i+1;
//        }
//        for (int j = 0; j < array.length; j++) {
//            a = array[j];
//            System.out.println(a + " ");
//        }
        //*******************************
//        int min = 0, max = 0;
//        int[] arr = {2, 6, 78, 93, 4, 1, 0, 345, 11};
//
//        for (int j = 0; j < arr.length; j++) {
//            if (min > arr[j]) {
//                min = arr[j];
//            }
//            if (max < arr[j]) {
//                max = arr[j];
//            }
//        }
//        System.out.println(min + " - min");
//        System.out.println(max + " - max");
        //*******************************
//        8. Ввести число с консоли, которое не заканчивается на 0. Вывести макс и мин цифру в числе. Использовать оператор %. (while)
/*        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число (не заканчивающееся на 0):");
        int number = scanner.nextInt();

        // Проверка, что число не заканчивается на 0
        if (number % 10 == 0) {
            System.out.println("Ошибка: число не должно заканчиваться на 0!");
            return;
        }

        int maxDigit = 0;
        int minDigit = 9;


        // Цикл while для извлечения каждой цифры
        while (number > 0) {
            int digit = number % 10;  // Получаем последнюю цифру
            // Находим максимальную цифру
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            // Находим минимальную цифру
            if (digit < minDigit) {
                minDigit = digit;
            }

            number = number / 10;  // Убираем последнюю цифру
        }
        System.out.println("Максимальная цифра: " + maxDigit);
        System.out.println("Минимальная цифра: " + minDigit);
*/
        /*8. Ввести число с консоли, которое не заканчивается на 0.
             Вывести макс и мин цифру в числе. Использовать оператор %. (while)*/
        //23 для примера
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        int minN = 100;
        int maxN=0;
        int vr;
        if (x % 10 == 0) {
            System.out.println("Число x не соответствует условию задания");
        } else {
            while (x > 0) {
                vr = x % 10;
                if (minN > vr) {
                    minN = vr;
                }
                if (maxN < vr) {
                    maxN = vr;
                }
                x= x/10;
            }
            System.out.println("Минимальное число: "+minN+" 20"+"Максимальное число: "+maxN);
        }
    }
}
