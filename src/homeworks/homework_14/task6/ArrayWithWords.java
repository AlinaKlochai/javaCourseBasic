package homeworks.homework_14.task6;


import java.util.Arrays;

public class ArrayWithWords {
    /*
        Дан массив слов.
        Создать два массива:
        - один из слов в котором нечетное количество букв
        - второй в котором четное

     */
    public static void main(String[] args) {
        String[] arrayWithWords = {"table", "computer", "lamp", "bed", "carpet", "armchair"};

        // считаем сколько есть в нашем массиве слов с четным(evenLengthCount) и нечесным(notEvenLengthCount) количеством букв

        int evenLengthCount = 0;
        int notEvenLengthCount = 0;

        //проходися по длине массива
        for (int i = 0; i < arrayWithWords.length; i++) {
            if (arrayWithWords[i].length() % 2 == 0) {    //метод .length() проверяет является ди i-иый елемент четным
                evenLengthCount++;                        //коглп да, увеоичивает счетчик четных чисел
            } else {
                notEvenLengthCount++;        ////коглп нет, увеоичивает счетчик нечетных чисел
            }
        }

        // Создание массивов с четным и нечетных уодтчесьвом букв
        String[] evenLengthCountOfArray = new String[evenLengthCount];
        String[] notEvenLengthCountOfArray = new String[notEvenLengthCount];

        // Заполнение массивов словами с четным и нечетным количеством букв
        int evenIndex = 0; // тут задантся переменная - чеиный индекс
        int notEvenIndex = 0;



        for (int i = 0; i < arrayWithWords.length; i++) {
            if (arrayWithWords[i].length() % 2 == 0) {                     // если длинв i-елементв  - четное число то
               evenLengthCountOfArray[evenIndex] = arrayWithWords[i];      // мы присваиваем элементу массива слов с честным колтчсьвом значение  (arrayWithWords[i]
                evenIndex++;                                               // м увеличиваем счетчик
            } else {
                notEvenLengthCountOfArray[notEvenIndex] = arrayWithWords[i];
                notEvenIndex++;
            }
        }


        System.out.println("Изначальный массив: " + Arrays.toString(arrayWithWords));
        System.out.println("-------------------------------------------------------------------------------------------------------");
        // Вывод результатов
        System.out.println("Слова с четным количеством букв: " + Arrays.toString(evenLengthCountOfArray));

        System.out.println("Слова с нечетным количеством букв: " + Arrays.toString(notEvenLengthCountOfArray));



    }

}
