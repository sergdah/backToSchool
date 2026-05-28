package task3;

public class HomeWork3 {

    public static void main(String[] args) {

        // 1.Дано уравнение x/6+25=98. Найти x и вывести его в консоль
        System.out.println("**************************");

        int x = 73 * 6;
        System.out.println("x = " + x);
        System.out.println();


        //2. x=x+5; y=y*9; z=z-6; Необходимо укоротить данные выражения, чтобы результат не изменился. x=8; y=9; z=12;
        //(операции присваивания, нужно просто написать по-другому)
        System.out.println("**************************");
        int x2 = 8;
        int y = 9;
        int z = 12;
        int a= x2 +5,b=y*9,c=z-6;
        System.out.println("До операций: x=" + a + ", y=" + b + ", z=" + c);

        x2 += 5;
        y *= 9;
        z -= 6;

        System.out.println("После операций: x=" + x2 + ", y=" + y + ", z=" + z);
        System.out.println();

        //3. Даны числа a=35, b=65. Если а>b, то присвоить числу c значение 5 иначе, присвоить числу c значение 10. (тернарный оператор)
        System.out.println("**************************");
        int num_a = 35;
        int num_b = 65;

        int num_c = (num_a > num_b) ? 5 : 10;

        System.out.print("Даны a = " + num_a + ", b = " + num_b);
        System.out.print(" так как a > b = " + (num_a > num_b));
        System.out.println(" c = " + num_c);
        System.out.println();


        //4*. Даны значения: x=5; y=2; c=x*y; Ра
        //составьте операции инкремента декремента так, чтобы после выполнения операции (c=x*y) с равнялось 12, x=равнялось 6, y=1
        //Выведите полученные значения в консоль. Эта задача со звёздочкой, необязательна к выполнению, но рекомендую её сделать.
        System.out.println("**************************");
        int x4 = 5;
        int y4 = 2;
        int c4 = x4 * y4;
        System.out.println("До инкремента/декремента: x=" + x4 + ", y=" + y4 + ", c=" + c4);

        c4 = ++x4 * y4--;

        System.out.println("После инкремента/декремента: x=" + x4 + ", y=" + y4 + ", c=" + c4);
    }
}
