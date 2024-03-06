package homeworks.homework_36.Generics.task_5;

import java.util.ArrayList;
import java.util.List;

public class StackDemo {
    public static void main(String[] args) {

        Stack<List<Integer>> listStack = new Stack<>();
        List<Integer> integerList = new ArrayList<>();

        integerList.add(4);
        integerList.add(45);
        listStack.pushElement(integerList);
        listStack.printList();
    }
}
