package homeworks.homework_36.Generics.task_9;

import java.util.HashMap;
import java.util.Map;

public class GenericsMap<K,V> {
    private Map<K,V> genericsMap;

    public GenericsMap() {
        this.genericsMap = new HashMap<>();
    }

    public Map<K, V> getGenericsMap() {
        return genericsMap;
    }

    public void put(K key, V value){
        genericsMap.put(key, value);
    }

    public V get(K key){
        return genericsMap.get(key);
    }

    public void remove(K key){
        genericsMap.remove(key);
    }

    @Override
    public String toString() {
        return "GenericsMap{" +
                "genericsMap=" + genericsMap +
                '}';
    }

    public static void main(String[] args) {

        GenericsMap<String,Integer> genericsMap1 = new GenericsMap<>();

        genericsMap1.put("Alex",35);
        genericsMap1.put("Mike",30);
        genericsMap1.put("Frank",28);

        System.out.println("Value of Key Alex: " + genericsMap1.get("Alex"));
        genericsMap1.remove("Mike");
        System.out.println("Map after remove");
        System.out.println(genericsMap1);


    }
}
