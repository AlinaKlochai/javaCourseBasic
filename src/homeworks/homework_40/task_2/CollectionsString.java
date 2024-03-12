package homeworks.homework_40.task_2;

import java.util.Arrays;
import java.util.List;

public class CollectionsString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "dog","small dog", "fish");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() % 2 != 0)
                .toList();

        System.out.println("All strings with odd length: ");
        filteredStrings.forEach(System.out::println);
    }
}
