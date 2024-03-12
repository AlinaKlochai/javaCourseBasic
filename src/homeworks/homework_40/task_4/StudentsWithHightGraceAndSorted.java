package homeworks.homework_40.task_4;

import java.util.ArrayList;
import java.util.List;

public class StudentsWithHightGraceAndSorted {
    public static void main(String[] args) {
        Student student1 = new Student("name1", 4.5,2019);
        Student student2 = new Student("name2", 4.6,2010);
        Student student3 = new Student("name3", 4.2,2020);
        Student student4 = new Student("name4", 4.8,2019);
        Student student5 = new Student("name5", 4.9,2024);

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

        System.out.println("Students with Grace more then 4.5 and sorted by year in ascending order: ");

        List<Student> sortedList = students.stream()
                .filter(student -> student.getGrace() > 4.5)
                .sorted((s1, s2) -> Integer.compare(s1.getYearStart(), s2.getYearStart()))
                .toList();
        sortedList.forEach(System.out::println);

    }
}
