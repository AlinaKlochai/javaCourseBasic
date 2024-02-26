package lessons.lesson_30.task_2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class DogsCollections {
    public static void main(String[] args) {
        Comparator<Pair> dogsComparator = new PairComparatorSecond().thenComparing(new PairComparatorFirst());

        Set<Pair> dogsSet = new TreeSet<>(dogsComparator);

        dogsSet.add(new Pair("Tom", 2));
        dogsSet.add(new Pair("Emma", 4));
        dogsSet.add(new Pair("Nick", 4));
        dogsSet.add(new Pair("Bill", 1));
        dogsSet.add(new Pair("Alice", 8));
        System.out.println("Сортировка с начала по возрасту, а потом по имени");
        System.out.println(dogsSet);

        Comparator<Pair> dogsComparatorAge = new PairComparatorSecond();
        Set<Pair> dogsSetAge = new TreeSet<>(dogsComparatorAge);
        dogsSetAge.add(new Pair("Tom",2));
        dogsSetAge.add(new Pair("Emma",4));
        dogsSetAge.add(new Pair("Nick",1));
        dogsSetAge.add(new Pair("Alice",8));
        System.out.println("Сортировка только по возрасту: ");
        System.out.println(dogsSetAge);

    }
}
