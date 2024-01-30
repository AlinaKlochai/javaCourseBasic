package homeworks.homework_06.task1;

//1 Создайте строку через new - I study Basic Java!
//2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//3 Распечатать последний символ строки. Используем метод String.charAt().
//4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//5 Заменить все символы “а” на “о”.
//6 Преобразуйте строку к верхнему регистру.
//7 Преобразуйте строку к нижнему регистру.
//8 Вырезать строку Java c помощью метода String.substring().

public class String {

    public static void main(String[] args) {

        //1 Создайте строку через new - I study Basic Java!

        java.lang.String myString = "I study Basic Java!";

        int myStringLength = myString.length();
        System.out.println("Длина моей строки: " + myStringLength);

        //3 Распечатать последний символ строки. Используем метод String.charAt().

        char lastSymbol = myString.charAt(myStringLength - 1);
        System.out.println("Последний символ строки" + lastSymbol);

        //4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

        boolean containsMyString = myString.contains("Java");
        System.out.println("Содержит ли моя строка подстроку “Java”? " + containsMyString);

        //5 Заменить все символы “а” на “о”.

        String replacedString = myString.replace('a', 'o');
        System.out.println("Заменяю все символы “а” на “о”: " + replacedString);

        //6 Преобразуйте строку к верхнему регистру.

        String upperCase = myString.toUpperCase();
        System.out.println("Преобразувую строку к верхнему регистру: " + upperCase);

        //7 Преобразуйте строку к нижнему регистру.

        String lowerCase = myString.toLowerCase();
        System.out.println("Преобразувую строку к нижнему регистру: " + lowerCase);

        //8 Вырезать строку Java c помощью метода String.substring().

        String subString = myString.substring(14,18);
        System.out.println("Вырезать строку Java: " + subString);














    }

}
