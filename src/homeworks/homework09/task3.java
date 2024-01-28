package homeworks.homework09;

import scanner.UserInput;

public class task3 {
    //Программа просит пользователя ввести число от 1 до 7
    //Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.

    public static void main(String[] args) {
        //Программа просит пользователя ввести число от 1 до 7

        UserInput ui = new UserInput();
        int x = ui.inputInteger("Введите число от 1 до 7: ");

        //Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.

        switch (x){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            default:
                System.out.println("Выходной");
        }


    }
}
