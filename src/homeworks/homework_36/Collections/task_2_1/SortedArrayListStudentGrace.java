package homeworks.homework_36.Collections.task_2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArrayListStudentGrace {
    public static void main(String[] args) {
        Student student1 = new Student("James", 4.2);
        Student student2 = new Student("Jons", 4.6);
        Student student3 = new Student("Jake", 4.5);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);
        students.sort(Collections.reverseOrder());
        System.out.println("Список студентов после сортировки по оценкам по убыванию");
        System.out.println(students);
    }
}
