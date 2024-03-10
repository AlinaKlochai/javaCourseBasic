package homeworks.homework_36.Optional.task_8;

import java.util.HashMap;
import java.util.Optional;

public class HashMapMaxValue {

    public static <K, V extends Comparable<V>> Optional<V> getKeyWithMaxValue(HashMap<K, V> hashMap){
        if (hashMap.isEmpty()){
            return Optional.empty();
        }
        V maxValue = null;
        for (V value : hashMap.values()){
            if (maxValue == null || value.compareTo(maxValue) > 0){
                maxValue = value;
            }
        }
        return Optional.of(maxValue);
    }


    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Alex", 35);
        hashMap.put("Donald", 38);
        hashMap.put("Coni",25);

        System.out.println(getKeyWithMaxValue(hashMap));

        System.out.println("----------");

        HashMap<Integer,String> hashMap2 = new HashMap<>();
        hashMap2.put(35,"Alex");
        hashMap2.put(38,"Donald");
        hashMap2.put(25,"Conni");

        System.out.println(getKeyWithMaxValue(hashMap2));

    }
}
