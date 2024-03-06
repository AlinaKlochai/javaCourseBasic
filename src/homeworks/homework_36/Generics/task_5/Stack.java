package homeworks.homework_36.Generics.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack <T>{
    private List<T> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public void pushElement(T item){
        list.add(item);
    }

    public void printList(){
        for (T item : list){
            if (item instanceof int[]) {
                System.out.println(Arrays.toString((int[]) item));
            }else {
                System.out.println(item);
            }
        }
    }
}
