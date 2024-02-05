package homeworks.homework_14.task8;

import scanner.UserInput;

public class Palindrom {
    public static void main(String[] args) {
        /*
            Дана строка.
            Написать метод, который определяет, является ли данная строка палиндромом
            (читается одинаково в обоих направлениях)

         */

        //просим пользователя ввести строку на проверку
        UserInput userInput = new UserInput();
        String myString = userInput.inputText("Введите строку для проверки ее на палиндромность: ");

        // создаем экзепляр класа, дабы потом обратиться к методу который находиться внутри этого класса
        CheckIsPalindrome checkIsPalindrome = new CheckIsPalindrome();


                if (checkIsPalindrome.isPalindrome(myString)) {            // если true
                    System.out.println("Строка является палиндромом.");
                } else {
                    System.out.println("Строка не является палиндромом.");  // если false
                }

    }
}
