package lessons.lesson_31.task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListInteger {
    public static void main(String[] args) {
        Set<Integer> numbers= new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        Iterator<Integer> integerIterator = numbers.iterator();

        while (integerIterator.hasNext()) {
            Integer tempNum = integerIterator.next();
            System.out.println(tempNum);
            if (tempNum > 4){
                integerIterator.remove();
            }
        }
        System.out.println("Колекция несостоящая из епементов больше 4: ");
        System.out.println(numbers);


    }
}
