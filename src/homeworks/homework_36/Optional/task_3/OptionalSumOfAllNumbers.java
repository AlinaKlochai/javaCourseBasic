package homeworks.homework_36.Optional.task_3;

import java.util.List;
import java.util.Optional;

public class OptionalSumOfAllNumbers {

        public static Optional<Integer> sumOfAllNumbers(List<Integer> integers){
            if(integers.isEmpty()){
                return Optional.empty();
            }
            int sum = 0;
            for (Integer integer : integers){
                sum = sum + integer;
            }
            return Optional.of(sum);
        }

        public static void main(String[] args) {
            List<Integer> numbers = List.of(11,34,2,5);
            Optional<Integer> sumResult = sumOfAllNumbers(numbers);


            if (sumResult.isPresent()){
                System.out.println("Sum of all integer elements: " + sumResult.get());
            }else {
                System.out.println("List of integers elements is empty");
            }

        }

}
