package homeworks.homework_11.task4;

public class DoubleLoop {

    /*Используйте двойной цикл для генерации таблицы умножения

     */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.println();
                System.out.println(i + "*" + j + "=" + (i * j) + "\t");

            }
            System.out.println();
        }

    }
}
