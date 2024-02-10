package homeworks.homework_07.task1;

/*1 Создайте строку через new - I study Basic Java!
2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
3 Распечатать последний символ строки. Используем метод String.charAt().
4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
5 Заменить все символы “а” на “о”.
6 Преобразуйте строку к верхнему регистру.
7 Преобразуйте строку к нижнему регистру.
8 Вырезать строку Java c помощью метода String.substring().

 */
public class MyString {

    public static void main(String[] args) {
        String myString = new String("I study Basic Java!");
        System.out.println("Введенная строка: " + myString);

        // вызываем созданный метод, куда передаем нашу строку для работы с ней

        workWithMyString(myString);
        
    }

    private static void workWithMyString(String myString) {
        // Печать последнего символа строки
        char lastChar = myString.charAt(myString.length() - 1);
        System.out.println("Последний символ строки этой: " + lastChar);

        // Проверка содержит ли строка подстроку "Java"
        boolean containsJava = myString.contains("Java");
        System.out.println("Содержит ли подстроку 'Java': " + containsJava);

        // Замена всех символов "а" на "о"
        String replacedStr = myString.replace('a', 'o');
        System.out.println("Строка после замены символов: " + replacedStr);

        // Преобразование строки к верхнему регистру
        String upperCaseStr = myString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        // Преобразование строки к нижнему регистру
        String lowerCaseStr = myString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        // Вырезание подстроки "Java"
        int startIndex = myString.indexOf("Java");
        String subStr = myString.substring(startIndex, startIndex + 4);
        System.out.println("Вырезанная подстрока: " + subStr);
    }

}
