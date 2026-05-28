package task6;

public class HomeWork6 {
    //1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
    // Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each
    public static void main(String[] args) {
        int[] array1 = {5, 12, 7, 9, 0, 33, 18, 21, 4, 11};
        System.out.println("Исходный массив:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) array1[i] = 0; // нечетный индекс -> 0
        }

        System.out.println("Массив после замены элементов с нечетным индексом:");
        for (int i : array1) System.out.print(i + ", ");
        System.out.println();
        System.out.println("**************************************");

        //2. Создать массив из 5 чисел и заполните этот массив вручную. Создайте второй массив с размерностью больше на 1 чем первый массив.
        // Необходимо скопировать первый массив со всеми значениями во второй массив. Последний элемент во втором массиве пусть будет 0.
        // Выведите второй массив в консоль с помощью цикла for each.
        int[] array2 = {5, 12, 7, 9, 0};
        int[] array3 = new int[6];
        array3[array3.length - 1] = 0;
        for (int i = 0; i < array2.length; i++) {
            array3[i] = array2[i];
        }
        for (int i : array3) System.out.print(i + ", ");
        System.out.println();
        System.out.println("***************************************");

        //3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива.
        // Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.
        int[] array1000 = {5, 12, 0, 9, 999};
        int minElement = 100000, a = 0;
        int maxElement = 0, b = 0;
        for (int i = 0; i < array1000.length; i++) {
            if (array1000[i] < minElement) {
                minElement = array1000[i];
                a = i;
            }
            if (array1000[i] > maxElement) {
                maxElement = array1000[i];
                b = i;
            }
        }
        System.out.println(maxElement + " max " + "array1000[" + b + "]");
        System.out.println(minElement + " min " + "array1000[" + a + "]");
        array1000[a] = -1000;
        array1000[b] = 1000;
        System.out.println(array1000[b] + " max " + "array1000[" + b + "]");
        System.out.println(array1000[a] + " min " + "array1000[" + a + "]");

        //4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания.
        // Вывести полученный массив. Выполнить с помощью цикла for
        int[] arrayFromMinToMax = {5, 12, 0, 9, 999, 3, 3852, -39, -123, 500};

        for (int i = 0; i < arrayFromMinToMax.length-1; i++) {

            for (int j = i + 1; j < arrayFromMinToMax.length; j++) {
                if (arrayFromMinToMax[j] < arrayFromMinToMax[i]) {
                    minElement = arrayFromMinToMax[j];
                    a=j;
                    maxElement = arrayFromMinToMax[i];
                    arrayFromMinToMax[i] = minElement;
                    arrayFromMinToMax[j] = maxElement;
                }

            }
        }
        for (int i = 0; i < arrayFromMinToMax.length; i++) {
            System.out.print(arrayFromMinToMax[i] + ", ");
        }


    }
}