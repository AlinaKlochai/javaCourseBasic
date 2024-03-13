package homeworks.homework_41.task_1;

import java.util.Arrays;
import java.util.List;

/*
Задание: Дан список строк.
Необходимо отфильтровать из этого списка все строки,
которые начинаются на букву "A" (без учёта регистра), и
вернуть список этих строк, отсортированный в алфавитном порядке.

 */
public class SortedListStrings {
    public static void main(String[] args) {

        List<String>strings = Arrays.asList("apple", "kiwi", "Apple1", "Abonnement","cat");

        List<String> sortedList = strings.stream()
                .filter(s -> s.toUpperCase().startsWith("A"))
                .sorted()
                .toList();

        System.out.println(sortedList);
    }
}
