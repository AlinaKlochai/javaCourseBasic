package homeworks.homework_36.Collections.task_1_3;

import java.util.HashMap;
import java.util.Map;

/*
Создать HashMap, где ключом является число типа Integer, а значением - его квадрат. Вывести на экран все элементы HashMap.

 */
public class HashMapWithSquareOfNumber {
    public static void main(String[] args) {
        Map<Integer,Integer> squareOfNumber = new HashMap<>();

        squareOfNumber.put(1,1*1);
        squareOfNumber.put(2,2*2);
        squareOfNumber.put(3,3*3);
        squareOfNumber.put(4,4*4);
        squareOfNumber.put(5,5*5);
        squareOfNumber.put(6,6*6);
        squareOfNumber.put(7,7*7);
        squareOfNumber.put(8,8*8);
        squareOfNumber.put(9,9*9);
        squareOfNumber.put(10,10*10);

        for (Map.Entry<Integer,Integer> entry : squareOfNumber.entrySet()){
            System.out.println("Число-> " + entry.getKey() + ",его квадрат -> " + entry.getValue());
        }




    }
}
