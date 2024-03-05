package projects.project_01.Variant_1;

import scanner.UserInput;

import java.util.Arrays;

public class ArrayService {

    UserInput userInput = new UserInput();

    public int[] createArrayFromUserInput(){
        int sizeOfArray = userInput.inputInteger("Введите число, которое будет определять длину массива: ");
        int[] array = new int[sizeOfArray];
        return array;
    }

    public int[] fillArrayFromUserInput(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = userInput.inputInteger("Введите число для заполнения массива: ");
        }
        return array;
    }


    public int[] reverseArray(int[] array){
        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {

        }
        return array;
    }

    public void printArray(int[] array) {
        System.out.print("Отсортированный массив целых чисел по убыванию: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
