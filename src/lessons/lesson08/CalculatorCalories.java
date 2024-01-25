package lessons.lesson08;

import homeworks.homework06.Pizza;
import scanner.UserInput;

public class CalculatorCalories {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        int diameterPizza = ui.inputInteger("Please enter first pizza diameter; ");
        int caloriesInOneCm = ui.inputInteger("Please enter 1 cm pizza calories: ");
        Pizza pizza1 = new Pizza(diameterPizza, caloriesInOneCm);

        diameterPizza = ui.inputInteger("Please enter second pizza diameter; ");

        caloriesInOneCm = ui.inputInteger("Please enter 1 cm pizza calories: ");

        Pizza pizza2 = new Pizza(diameterPizza, caloriesInOneCm);
        double extraCalories = pizza2.totalCaloriesInPizza() - pizza1.totalCaloriesInPizza();
        System.out.println("Количество лишних калорий: " + extraCalories);


    }

}
