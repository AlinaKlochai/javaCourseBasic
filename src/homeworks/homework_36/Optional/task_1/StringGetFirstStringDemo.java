package homeworks.homework_36.Optional.task_1;

import java.util.ArrayList;
import java.util.List;

public class StringGetFirstStringDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("cat");
        strings.add("dog");
        strings.add("fish");


        System.out.println(StringOptional.getFirstString(strings));

    }
}
