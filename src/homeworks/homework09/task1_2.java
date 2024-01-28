package homeworks.homework09;

import scanner.UserInput;

public class task1_2 {

    //Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
    //а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3 с использованием switch
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int x = ui.inputInteger("Введите число от 1 до 3: ");

        switch (x){
            case 1:
                System.out.println("Вы ввели число 1.");
                break;
            case 2:
                System.out.println("Вы ввели число 2.");
                break;
            case 3:
                System.out.println("Вы ввели число 3.");
                break;
            default:
                System.out.println("Этого числа нет в моей базе данных :(((");

        }

    }

}
