package homeworks.homework_40.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListStringInOneString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "dog","small dog", "fish");

        String allInOneString = strings.stream()
                .collect(Collectors.joining());     //Этот коллектор объединяет элементы коллекции в одну строку


        System.out.println("All strings in one string: ");
        System.out.println(allInOneString);
    }
}
