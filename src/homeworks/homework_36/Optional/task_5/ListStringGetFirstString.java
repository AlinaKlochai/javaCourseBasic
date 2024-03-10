package homeworks.homework_36.Optional.task_5;

import java.util.List;
import java.util.Optional;

public class ListStringGetFirstString {
    public static Optional<String> getFirstString(List<String> strings){
        if (!strings.isEmpty()){
            return Optional.of(strings.getFirst());
        }else {
            return Optional.of("NoSuchElementException");
        }
    }

    public static void main(String[] args) {
       List<String>strings = List.of("Cat","Dog");
        System.out.println(getFirstString(strings));

        List<String>strings2 = List.of();
        System.out.println(getFirstString(strings2));

    }
}
