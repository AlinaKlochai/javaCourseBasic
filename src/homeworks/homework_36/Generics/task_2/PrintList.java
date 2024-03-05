package homeworks.homework_36.Generics.task_2;

import java.util.List;

public class PrintList {
    public static <T> void printList(List<T> list){
        for (T item : list){
            System.out.println(item);
        }
    }
}
