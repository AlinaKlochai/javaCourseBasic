package homeworks.homework_40.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListWithStudentsAVGGrace {
    public static void main(String[] args) {
        Student student1 = new Student("name1",25,4.9);
        Student student2 = new Student("name2",28,4.5);
        Student student3 = new Student("name3",35,4.6);
        Student student4 = new Student("name4",38,5.0);
        Student student5 = new Student("name5",29,4.3);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("All students: ");
        for (Student student : students){
            System.out.println(student);
        }

        System.out.println("Students with Grace more then 4.5: ");

        List<Student> sortedList = students.stream()
                        .filter(student -> student.getAvgGrace() > 4.5)
                        .toList();
        sortedList.forEach(System.out::println);

    }
}
