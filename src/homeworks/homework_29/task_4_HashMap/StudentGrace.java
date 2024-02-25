package homeworks.homework_29.task_4_HashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentGrace {
    public static void main(String[] args) {
        Map<String,Double> studentGrace = new HashMap<>();

        studentGrace.put("John Kam",4.0);
        studentGrace.put("Emma Wilson", 4.5);
        studentGrace.put("David Jonson", 4.2);
        studentGrace.put("Tommy Hilfiger", 4.6);
        studentGrace.put("Georg Holly", 4.8);

        System.out.println("Список студентов со средними баллами:");
        for (Map.Entry<String,Double> entry : studentGrace.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //Найдите и выведите имя студента с наивысшим средним баллом.
        String studentWithHighestGrade = null;
        double highestGrace = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : studentGrace.entrySet()){
        if (entry.getValue() > highestGrace){
            highestGrace = entry.getValue();
            studentWithHighestGrade = entry.getKey();
        }
        }

        System.out.println("Студент с найвысшим средним баллом: " + studentWithHighestGrade);

        // Изменяем средний балл студента
        studentGrace.put("Emma Wilson", 4.7);

        System.out.println("Обновленный список студентов со средними баллами:");
        for (Map.Entry<String, Double> entry : studentGrace.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
