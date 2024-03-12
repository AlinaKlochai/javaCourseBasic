package homeworks.homework_36.Collections.task_2_7;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class LinkedListTasksTime {
    public static void main(String[] args) {

                Map<Time, List<String>> timeTasksMap = new LinkedHashMap<>();

                List<String> stringList1 = List.of("task1", "task2");
                List<String> stringList2 = List.of("task1");
                List<String> stringList3 = List.of( "task3","task4");

                Time time1 = new Time(15);
                Time time2 = new Time(8);
                Time time3 = new Time(20);

                timeTasksMap.put(time1,stringList1);
                timeTasksMap.put(time2,stringList2);
                timeTasksMap.put(time3,stringList3);

                System.out.println(timeTasksMap);

        TreeSet<Time> timeSet = new TreeSet<>(timeTasksMap.keySet());
        System.out.println("\nCopied TreeSet:");
        System.out.println(timeSet);



    }
}
