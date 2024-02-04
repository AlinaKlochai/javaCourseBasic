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

        for (int i = 0; i < arrayWithWords.length; i++) {
            if (arrayWithWords[i].length() % 2 == 0) {
                evenLengthCount++;
            } else {
                notEvenLengthCount++;
            }
        }

        // Создание массивов
        String[] evenLengthCountOfArray = new String[evenLengthCount];
        String[] notEvenLengthCountOfArray = new String[notEvenLengthCount];

        // Заполнение массивов словами с четным и нечетным количеством букв
        int evenIndex = 0;
        int notEvenIndex = 0;

        for (int i = 0; i < arrayWithWords.length; i++) {
            if (arrayWithWords[i].length() % 2 == 0) {
               evenLengthCountOfArray[evenIndex++] = arrayWithWords[i];
            } else {
                notEvenLengthCountOfArray[notEvenIndex++] = arrayWithWords[i];
            }
        }


        System.out.println("Изначальный массив: " + Arrays.toString(arrayWithWords));
        System.out.println("-------------------------------------------------------------------------------------------------------");
        // Вывод результатов
        System.out.println("Слова с четным количеством букв: " + Arrays.toString(evenLengthCountOfArray));


        System.out.println("Слова с нечетным количеством букв: " + Arrays.toString(notEvenLengthCountOfArray));



    }

}
