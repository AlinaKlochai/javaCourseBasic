package homeworks.homework_36.Optional.task_3;

import java.util.List;

public class SumOfAllIntegerWithoutOptional {

    public static int sumOfAllNumbers(List<Integer> integers){
        if(integers.isEmpty()){
            return 0;
        }
        int sum = 0;
        for (Integer integer : integers){
            sum = sum + integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(11,34,2,5);
        int sumNumbers = sumOfAllNumbers(numbers);
        System.out.println(sumNumbers);
    }
}
