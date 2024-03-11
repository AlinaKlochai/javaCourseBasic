package lessons.lesson_39.Task_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        Student student2 = new Student("Vova");
        Student student3 = new Student("Olga");

        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList,((o1, o2) -> o1.getName().compareTo(o2.getName())));
        System.out.println(studentList);
    }
}
