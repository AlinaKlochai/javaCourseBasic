package homeworks.homework_14.task7;

import java.util.Random;

/*
Создать массив размера , полученного от пользователя
Наполнить этот массив случайными числами в диапазоне до 100
- найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
- найти сумму всех элементов

если максимальный элемент повторяется несколько раз то создать массив из индесов

в идеале - оформить основные модули вашей программы отдельными методами

 */

public class ArrayService {
    public int[] createIntArray(int arrayLength){

        // мы создаем метод, цель которого будет создвание массива для этого
        // ему потребудется значение которое ему будет передано(int arrayLength)
        // и будет созранено в этой переменной
        // М результатом этого метода будет массив (int[]) который должен быть
        // создан и передан в качестве результата его работы

        int[] newArray = new int[arrayLength];  // создаем новый массив с переданными параметрами(int[arrayLength])
        return newArray;  // возвращаем результат работы нашего метода

    }


    public void fillArrayRandom(int [] workingArray, int startValue, int endValue){
        /*
        1) воспользоваться классом Random
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

    /*
        - найти максимум среди элементов массива и его индекс (если значения повторяются то найти первый)
        - найти сумму всех элементов

        если максимальный элемент повторяется несколько раз то создать массив из индесов

     */
    public int[] findMaxValueAndIndex(int [] workingArray, int startValue, int endValue){
        int max = workingArray[0];
        int maxIndex = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] > max){
                max = workingArray[i];
                maxIndex = i;
            }

        }
        return new int[]{max,maxIndex};

    }

}
