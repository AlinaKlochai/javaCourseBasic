package homeworks.homework_36.Collections.task_2_2;

import java.util.List;
import java.util.TreeMap;

public class TreeMapDataListString {
    public static void main(String[] args) {
        TreeMap<Data, List<String>> dataListTreeMap = new TreeMap<>();

        List<String> stringList1 = List.of("Math", "Biologi");
        List<String> stringList2 = List.of("Math");
        List<String> stringList3 = List.of( "Biologi","German");

        Data data1 = new Data(15);
        Data data2 = new Data(8);
        Data data3 = new Data(30);

        dataListTreeMap.put(data1,stringList1);
        dataListTreeMap.put(data2,stringList2);
        dataListTreeMap.put(data3,stringList3);

        System.out.println(dataListTreeMap);
    }
}
