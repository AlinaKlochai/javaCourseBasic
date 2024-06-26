package homeworks.homework_06.task2;

/* Задание:

    Введите 2 слова, используйте сканер.
Получить слово, состоящее из первой половины первого слова и второй половины второго слова.

для этого: взять первое слово, найти его длину, вычислить индекс его середины и получить подстроку которая начинается с 0 индекса и до середины
затем, взять второе слово, найти его длину, вычислить индекс его середины и получить подстроку которая начинается с середины и до конца


Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.

если букв 4 то 2 + 2 ( от 0 индекса до 2) 4 / 2 = 2
если букв 5 то 2 + 1 + 2 (от 0 индекса до 2) 5 / 2 = 2.5

в формуле вычисления середины - округлить вниз для первого слова или округлить вверх для второго слова



Распечатать на консоль.

 */

import homeworks.homework_06.task2.InputText;

public class InputTextDemo {
    public static void main(String[] args) {
        InputText sorceText = new InputText();
        String word1 = sorceText.inputTextFroKeyboard("Please enter word 1:");

        String word2 = sorceText.inputTextFroKeyboard("Please enter word 2:");

        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);

        int firstWordLength = word1.length();
        int secondWordLength = word2.length();

        int middleIndexFirstWord = firstWordLength / 2 ;


        int middleIndexSecondWord = (int) Math.ceil(secondWordLength / 2.0);
         /*
        Исходя из задания, например

        "01234567" - длина слова 8 символов
        серединный индекс = 8 / 2 = 4
        то есть при вызове метода substring(0,4) мы получим результат "0123"


       но если мы вызываем substring(4,8) мы получим результат "4567"

       Для нечетного количества символов
        "012345678" - длина слова 9 символов
        серединный индекс = (int) (9 / 2) = 4

        то есть при вызове метода substring(0,4) мы получим результат "0123"

       но если мы вызываем substring(5,9) мы получим результат "45678"
         */

        System.out.println(middleIndexFirstWord);
        System.out.println(middleIndexSecondWord);

        // получаем подстроки

        String firstPart = word1.substring(0,middleIndexFirstWord);
        String secondPart = word2.substring(middleIndexSecondWord);

        // соединяем строки

        String mergeWord = firstPart + secondPart;

        System.out.println("Результат слияния: " + mergeWord) ;


    }
}
