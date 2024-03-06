package homeworks.homework_36.Optional.task_2;

import java.util.Optional;

public class IntegerWithOptionalDemo {
    public static void main(String[] args) {

        int integer = 3;
        Optional<Integer> optionalInteger = Optional.of(integer);
        System.out.println(IntegerOptional.integerOptional(optionalInteger));

    }
}
