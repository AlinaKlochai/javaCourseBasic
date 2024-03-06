package homeworks.homework_36.Optional.task_2;

import java.util.Optional;

public class IntegerOptional {
    public static Integer integerOptional(Optional<Integer> optNumber){
        if (optNumber.isPresent()) {
            return optNumber.get() * 2;
        } else {
            return null;
        }
    }
}
