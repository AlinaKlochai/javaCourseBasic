package homeworks.homework_02;

public class Homework02 {

    public static void main(String[] args) {

        // Task 2

        /*Создать класс.
            Объявить метод main.
            В методе main инициализировать переменные для всех примитивных типов.
            Вывести их результат в консоль

            Например:
            char: G
            int: 89
            byte: 4
            short: 56
            float: 4.7333436
            double: 4.355453532
            long: 12121

         */
        System.out.println("-----Task 2-----");


        char a = 'A';
        System.out.println("char: " + a);

        int b = 96;
        System.out.println("int: " + b);

        byte c = 8;
        System.out.println("byte: " + c);

        short d = 65;
        System.out.println("short: " + d);

        float e = 6.4F;
        System.out.println("float: " + e);

        double f = 3.769420413;
        System.out.println("double: " + f);

        long g = 14264;
        System.out.println("long: " + g);

        // Task 3
        /*Дано трехзначное число (произвольное).
            Создать три переменные в которые с помощью математических действий
            присвоить цифры этого числа
            Вывести на экран все переменные (не напечатать цифры, а именно
            получить значения переменных).

               Пример: 345
            Вывод в консоль: Число 345 -> 3, 4, 5

         */
        System.out.println("-----Task 3-----");

        int x = 567;

        System.out.println(x / 100 + ",");
        System.out.println((x - 500 - 7) / 10 + ",");
        System.out.println(x - 500 - 60);

        int number = 567;

        int d1 = number / 100;
        int d2 = (number / 10) % 10;
        int d3 = number % 10;

        System.out.println("Первая цыфра из нащего числа " + d1);
        System.out.println("Вторая цыфра из нащего числа " + d2);
        System.out.println("Третяя цыфра из нащего числа " + d3);




    }
}
