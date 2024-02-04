package homeworks.homework_14.task2;

public class ArrayService {

    public int[] createNumbersArray() {
        int size = 50;
        int[] array = new int[size]; // Размер массива 50, так как нечетных чисел в интервале [1;99] - 50 штук.
        int currentValue = 1;

        System.out.print("Массив нечетных чисел от 1 до 99: ");

        for (int i = 0; i < size; i++) {
            array[i] = currentValue;// Заполняем массив числами от 1 до 99.
            currentValue = currentValue + 2;
        }

        return array;
    }


    public int[] printArrayInReverse(int[] array) {
        System.out.print("Массив нечетных чисел от 1 до 99 в обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
