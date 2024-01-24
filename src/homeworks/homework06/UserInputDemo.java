package homeworks.homework06;

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

        UserInput ui = new UserInput();

        String name = ui.inputName("Введите имя: ");
        System.out.println("Hello " + name + "!");
    }
}
