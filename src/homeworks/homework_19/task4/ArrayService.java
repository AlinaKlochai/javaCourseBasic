package homeworks.homework_19.task4;

import scanner.UserInput;

import java.util.Random;

public class ArrayService {

    public int inputSizeOfArray() {
    UserInput userInput = new UserInput();
    int sizeOfArray = userInput.inputInteger("Введите размер массива: ");
    return sizeOfArray;
}


    //просим ввести у пользователя стартовое значение в массиве
    public int inputStartValue() {
        UserInput userInput = new UserInput();
        int startValue = userInput.inputInteger("Введите стартовое значение в массиве: ");
        return startValue;
    }

    //просим ввести у пользователя конечное значение в массиве
    public int inputEndValue() {
        UserInput userInput = new UserInput();
        int endValue = userInput.inputInteger("Введите конечное значение в массиве: ");
        return endValue;
    }

    //создать массив
    public int[] createArray(int sizeOfArray, int startValue, int endValue) {
        int[] newArray = new int[sizeOfArray];

        return newArray;
    }

    // заполнить массив
    public int[] fillArray(int[] newArray, int startValue, int endValue) {
        Random random = new Random();

        for (int i = 0; i < newArray.length; i++) {
            int randomValue = random.nextInt(startValue, endValue + 1);
            newArray[i] = randomValue;
        }

        return newArray;
    }

    public double calculateAverage(int[] newArray) {
        double sum = 0;

        for (int i = 0; i < newArray.length; i++) {

            sum += newArray[i];
        }

        return sum / (double) newArray.length;
    }


}
