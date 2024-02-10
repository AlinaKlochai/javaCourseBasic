package homeworks.homework_19.task1;

import scanner.UserInput;

public class StringArrayServise {

    //просим ввести у пользователя размер нашего массива
    public int inputSizeOfArray(){
        UserInput userInput = new UserInput();
        int sizeOfArray = userInput.inputInteger("Введите размер массива: ");
        return sizeOfArray;
    }

    //создать массив
    public String[] createArray(int sizeOfArray){
        String[] newArray = new String[sizeOfArray];  // создаем новый массив с переданными параметрами(int[arrayLength])
        return newArray;                         // возвращаем результат работы нашего метода уже созданный масиив
    }

    // заполнить массив

    public String[] fillArray(String[] newArray){
        UserInput userInput = new UserInput();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = userInput.inputText("Введите слово: ");

        }
        return newArray;
    }

    // переворачиваем элементы в массиве в обратном порядке

    public String[] reverseArray(String[] newArray) {

        for (int i = 0; i < newArray.length / 2; i++) { //проходимся до середины массива, чтобы избежать повторного обмена элементов
            String temp = newArray[i];
            newArray[i] = newArray[newArray.length - i - 1]; // записывае
            newArray[newArray.length - i - 1] = temp;
        }
        return newArray;
    }


}
