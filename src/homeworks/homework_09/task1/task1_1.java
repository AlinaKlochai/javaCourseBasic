package homeworks.homework_09.task1;

import scanner.UserInput;

public class task1_1 {

    //Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
    //а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        int x = ui.inputInteger("Введите число: ");

        if (x == 1){
            System.out.println("Вы ввели число 1.");
        } else if ( x== 2){
            System.out.println("Вы ввели число 2.");
        } else if ( x == 3){
            System.out.println("Вы ввели число 3.");
        }


    }

}
