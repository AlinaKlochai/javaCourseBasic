package homeworks.homework_36.Generics.task_2;

import java.util.ArrayList;
import java.util.List;

public class PrintListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Cat");
        stringList.add("Dog");
        stringList.add("Fish");
        PrintList.printList(stringList);


    }
}
