package homeworks.homework_06.task1;

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
            //1 Создайте строку через new - I study Basic Java!
            String line = "I study Basic Java!";
            System.out.println("Заданная строка: " + line);
            // высчитаем длину заданной строки
            int lineLength = line.length();

            //3 Распечатать последний символ строки. Используем метод String.charAt().
            char lastSymbol = line.charAt(lineLength -1);
            System.out.println("Последний символ в этой строке: " + lastSymbol);

            //4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
            String innerLine = "Java";
            boolean innerLineCheck = line.contains(innerLine);
            System.out.println("Содержит ли наша строка подстроку “Java”? "+ innerLineCheck);

            //5 Заменить все символы “а” на “о”.
            String replace = line.replace('a','o');
            System.out.println("Новая строка уже с замененными символами 'a' на 'o': " + replace);

            //6 Преобразуйте строку к верхнему регистру.
            String lineToUpperCase = line.toUpperCase();
            System.out.println("Преобразованная строка к верхнему регистру: " + lineToUpperCase);

            //7 Преобразуйте строку к нижнему регистру.
            String lineToLowerCase = line.toLowerCase();
            System.out.println("Преобразуйте строку к нижнему регистру: " + lineToLowerCase);

            //8 Вырезать строку Java c помощью метода String.substring().
            String substringJava = line.substring(14,18);
            System.out.println("Вырезаем подстроку 'Java': " + substringJava);

        }
    }

