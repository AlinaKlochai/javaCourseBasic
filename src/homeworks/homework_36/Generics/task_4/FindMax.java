package homeworks.homework_36.Generics.task_4;

public class FindMax {

    public static <T extends Comparable<T>> T findMax(T[] array){
        if(array == null || array.length == 0){
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0){
                max = array[i];
            }

        }
        return max;
    }
}
