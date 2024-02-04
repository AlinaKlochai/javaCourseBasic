package homeworks.homework_14.task3;

import java.util.Random;

public class ArrayServise {

    public int[] createIntArray(int arrayLength){

        // мы создаем метод, цель которого будет создвание массива для этого
        // ему потребудется значение которое ему будет передано(int arrayLength)
        // и будет созранено в этой переменной
        // М результатом этого метода будет массив (int[]) который должен быть
        // создан и передан в качестве результата его работы

        int[] newArray = new int[arrayLength];  // создаем новый массив с переданными параметрами(int[arrayLength])
        return newArray;  // влзвращаем результат работы нашего метода

    }


    public void fillArrayRandom(int [] workingArray, int startValue, int endValue){
        /*
        1) врспользрваться классом Random
        2) в цикле от 0 до конца для КАЖДОГО елемента нужно:
             - вычислить рандомное число из диапазона от startValue до  endValue
             - сохранить это значение с i-ом элементе массива
         */

        Random random = new Random();

        for (int i = 0; i < workingArray.length; i++) {
            int randomValue = random.nextInt(startValue, endValue + 1);
            workingArray[i] = randomValue;
        }
    }

    // создаем метод, котрый будет прозодиться по каждому елементу массива и проверять на наличие четности
    // если елемент четный то увеоичиваем счетчик на +1
    public int countEvenNumbers(int[] workingArray){
        int evenCount = 0;

        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] % 2 == 0){
                evenCount++;                             // если елемент четный то увеоичиваем счетчик на +1
            }

        }
        return evenCount;
    }
}
