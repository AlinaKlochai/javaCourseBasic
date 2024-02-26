package lessons.lesson_29.task_1_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    public static void main(String[] args) {
        Map<String, List<Info>> stringListMap = new HashMap<>();

        Info infoSt1 = new Info("Math",4.5);
        Info infoSt2 = new Info("Math",4.8);
        Info infoSt3 = new Info("Math",5);

        List<Info> infoAboutSt1 = new ArrayList<>();
        infoAboutSt1.add(infoSt1);

        List<Info> infoAboutSt2 = new ArrayList<>();
        infoAboutSt2.add(infoSt2);

        List<Info> infoAboutSt3 = new ArrayList<>();
        infoAboutSt3.add(infoSt3);

        stringListMap.put("John",infoAboutSt1);
        stringListMap.put("James",infoAboutSt2);
        stringListMap.put("Melissa",infoAboutSt3);

        System.out.println(stringListMap);


    }
}
