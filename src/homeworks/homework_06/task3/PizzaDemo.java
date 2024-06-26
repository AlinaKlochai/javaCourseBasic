package homeworks.homework_06.task3;

   /*

Напишите программу, которая вычисляет, сколько лишних калорий будет,
если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.


    1. считаем площадь в пицце № 1

    2. считаем площадь в пицце № 2

    3. считаем количество калорий в пицце № 1

    4. считаем количество калорий в пицце № 2

     5. находим разницу

     */

import homeworks.homework_06.task3.Pizza;

public class PizzaDemo {
    public static void main(String[] args) {
        int diameterPizza1 = 24;
        int diameterPizza2 = 28;
        int caloriesInOneCm = 40;

        Pizza pizza1 = new Pizza(diameterPizza1, caloriesInOneCm);
        Pizza pizza2 = new Pizza(diameterPizza2, caloriesInOneCm);
        double extraCalories = pizza2.totalCaloriesInPizza() - pizza1.totalCaloriesInPizza();
        System.out.println("Количество лишних калорий: " + extraCalories);

    }
}
