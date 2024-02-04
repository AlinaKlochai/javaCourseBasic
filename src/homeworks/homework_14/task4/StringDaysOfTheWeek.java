package homeworks.homework_14.task4;

import scanner.UserInput;

public class StringDaysOfTheWeek {
    public static void main(String[] args) {

        /*
            1. Создать массив типа String с размером 7.
            2. Записать в него значения дней недели.
            3. Вывести на консоль значение последнего элемента.
         */

        String[] daysOfWeek = new String[7];

        daysOfWeek[0] = "Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

        UserInput userInput = new UserInput();


        switch (userInput.inputInteger("Please enter integer number from 0 to 6: ")) {
            case 0:
                System.out.println("First day in week: " + daysOfWeek[0]);
                break;
            case 1:
                System.out.println("Second day in week: " + daysOfWeek[1]);
                break;
            case 2:
                System.out.println("Third day in week: " + daysOfWeek[2]);
                break;
            case 3:
                System.out.println("Fourth day in week: " + daysOfWeek[3]);
                break;
            case 4:
                System.out.println("Fifth day in week: " + daysOfWeek[4]);
                break;
            case 5:
                System.out.println("Sixth day in week: " + daysOfWeek[5]);
                break;
            case 6:
                System.out.println("Seven day in week: " + daysOfWeek[6]);
                break;
            default:
                System.out.println("There is no such day in the week.");
        }
        System.out.println("The last day of the week: " + daysOfWeek[6]);

    }
}
