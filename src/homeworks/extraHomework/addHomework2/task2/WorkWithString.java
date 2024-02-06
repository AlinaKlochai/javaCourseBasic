package homeworks.extraHomework.addHomework2.task2;

import scanner.UserInput;

public class WorkWithString {
    public static void main(String[] args) {

        //Тема: создание переменной типа String.
        //
        //Напишите программу в которой создайте переменную
        //типа String и присвойте ей в качестве начального значения
        //ваше имя. Выведете на консоль значение этой переменной.

        String myName  = "Alina";
        System.out.println(myName);
        System.out.println("--------------------------------------------");


        //Напишите программу в которой создайте переменную
        //типа String и присвойте ей в качестве начального значения
        //ваше имя. Выведете на консоль приветствие типа "Hi YourName".

        System.out.println("Hi " + myName + " !");
        System.out.println("--------------------------------------------");

        /*Тема: Считывание строк с консоли.

            Программа должна спрашивать как зовут пользователя,
            считывать его имя с консоли и выводить приветствие
            в виде: "Hello UserName!".

            Подсказка: строку с консоли можно считать используя
            обьект Scanner. Загуглите как это можно сделать:
            "как в Java считать строку с консоли".

         */

        UserInput userInput = new UserInput();
        String userName = userInput.inputText("What is your name? ");
        System.out.println("Hello " + userName + "!");





    }
}
