package homeworks.homework_36.Collections.task_1_9;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapIntegerFactorial {
    public static void main(String[] args) {
        Map<Integer,Integer> factorialMap = new TreeMap<>();

        factorialMap.put(1,factorial(1));
        factorialMap.put(2,factorial(2));
        factorialMap.put(3,factorial(3));
        factorialMap.put(4,factorial(4));
        factorialMap.put(5,factorial(5));

        System.out.println(factorialMap);
       // printTreeMap(factorialMap);

    }

    //метод для вычисления факториала
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    private static void printTreeMap(TreeMap<Integer, Integer> factorialMap){
        for (Map.Entry<Integer,Integer> entry : factorialMap.entrySet()){
            System.out.println("Integer-> " + entry.getKey() + ", его факториал -> " + entry.getValue());
        }
    }
}
