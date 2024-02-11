package homeworks.homework_19.task3;

import scanner.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomServise {
    //просим ввести у пользователя размер нашего массива
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

    //сотрируем наш массив с помощью BubleSort, но чтобы цыфры были в обратном порядку отростированы

    public int[] sortArray (int[] newArray){
            boolean notSorted = true;

            int temp;

            while (notSorted) {
                notSorted = false;

                for (int i = 0; i < newArray.length - 1; i++) {

                    if (newArray[i + 1] > newArray[i]) {
                        temp = newArray[i + 1];
                        newArray[i + 1] = newArray[i];
                        newArray[i] = temp;
                        notSorted = true;
                    }

                }

            }
            return newArray;

    }


}



