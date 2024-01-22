package homeworks;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("-----Task 1-----");
        //Напишите программу, которая выводит на экран информацию о вас (или выдуманном персонаже) в три строчки:
        //```console
        //"Меня зовут ..."
        //"Мне ... лет"
        //"Я из ..."

                String namePerson1 = "Алина Клочай";
                int agePerson1 = 27;
                String countryPerson1 = "Украины";

                System.out.println("Меня зовут " + namePerson1 + ".");
                System.out.println("Мне " + agePerson1 + " лет" + ".");
                System.out.println("Я из " + countryPerson1 + ".");


        System.out.println("-----Task 2-----");

        //Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
        //Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
        //Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        //Распечатайте её через println. Сколько программа отбросила в дробной части?

                int var1 = 0;
                int var2 = 1;
                int var3 = 2;
                int var4 = 3;
                int var5 = 4;
                int var6 = 5;
                int var7 = 6;
                int var8 = 7;
                int var9 = 8;
                int var10 = 9;

                int sum = var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10;
                int averageSum = sum / 10;
                // Выыодим среднее арифметическое всех переменных
                System.out.println("Среднее арифметическое: " + averageSum);

                // Вывод дробной части, которую программа отбросила.
                int remainder = sum % 10;
                System.out.println("Программа отбросила в дробной части: " + remainder);

        System.out.println("-----Task 3-----");

        //Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
        //Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
        //Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
        //Отдельно выведите на экран сумму скидки от этой покупки.

                int priceA = 1000;
                int priceB = 500;
                int discount = 100;

                int totalPriceWithDiscount = priceA + priceB - discount;

                System.out.println("Стоимости суммы A+B со скидкой: " + totalPriceWithDiscount+ " руб.");
                System.out.println("Сумма скидки от этой покупки: " + discount + " руб.");

        System.out.println("-----Task 4-----");

        //Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
        //Вычислите среднюю температуру за неделю и выведете ее на печать.

        int monT = 1;
        int tueT = 1;
        int weT = -3;
        int thT = -2;
        int frT = -2;
        int saT = -1;
        int suT = 1;

        float sumT = (monT + tueT + weT + thT + frT + saT + suT);
        double averageSumT = sumT / 7;
        String averageResult = String.format("%.1f",averageSumT);
        System.out.println("Средняя температурв за неделю: " + averageResult + "°C");


        System.out.println("-----Task 5-----");

        //Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?
        //Покажите это на конкретных примерах.

        int number1 = 2;
        int remTwo1 = number1 % 2;
        System.out.println("Oстаток от деления на число 2: " );
        System.out.println(number1 + " % 2 = " + remTwo1);
        int number2 = 13;
        int remTwo2 = number2 % 2;
        System.out.println(number2 + " % 2 = " + remTwo2);

        int number3 = 9;
        int remThree3 = number3 % 3;
        System.out.println("Oстаток от деления на число 3: " );
        System.out.println(number3 + " % 3 = " + remThree3);
        int number4 = 31;
        int remFour4 = number4 % 3;
        System.out.println(number4 + " % 3 = " + remFour4);



        

    }
}
