package homeworks.homework_06.task4;

import homeworks.homework_06.task4.UserInput;

public class UserInputDemo {
    public static void main(String[] args) {
        //Тема: создание переменной типа String.
        //Напишите программу в которой создайте переменную
        //типа String и присвойте ей в качестве начального значения
        //ваше имя. Выведете на консоль значение этой переменной.
        String myName  = "Alina";
        System.out.println(myName);

        //Тема: Конкатенация строк.
        //Напишите программу в которой создайте переменную
        //типа String и присвойте ей в качестве начального значения
        //ваше имя. Выведете на консоль приветствие типа "Hi YourName".
        System.out.println("Hi " + myName + " !");

        //Тема: Считывание строк с консоли.
        //Программа должна спрашивать как зовут пользователя,
        //считывать его имя с консоли и выводить приветствие
        //в виде: "Hello UserName!".

        UserInput ui = new UserInput();

        String name = ui.inputName("Введите имя: ");
        System.out.println("Hello " + name + "!");
    }
}
