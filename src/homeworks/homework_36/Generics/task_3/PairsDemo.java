package homeworks.homework_36.Generics.task_3;

import java.util.ArrayList;
import java.util.List;

public class PairsDemo {
    public static void main(String[] args) {
        Pairs<String,Integer> stringIntegerPairs = new Pairs<>("Computer",5);
        stringIntegerPairs.printInfo();

        List<Double> grades = new ArrayList<>();
        grades.add(5.0);
        grades.add(4.8);
        Pairs<String, List<Double>> stringListPairs = new Pairs<>("John Week",grades);
        stringListPairs.printInfo();
    }
}
