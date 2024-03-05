package homeworks.homework_36.Collections.task_1_5;

import java.util.Map;

/*
Создать TreeMap, где ключом является строка, а значением - ее длина. Вывести на экран все элементы TreeMap.

 */
public class TreeMap {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new java.util.TreeMap<>();
        treeMap.put("cat","cat".length());
        treeMap.put("small dog","small dog".length());
        treeMap.put("big dog","big dog".length());
        treeMap.put("fish","fish".length());

        for (Map.Entry<String,Integer> entry : treeMap.entrySet()){
            System.out.println("Ключ-> " + entry.getKey() + ",значение -> " + entry.getValue());
        }

    }
}
