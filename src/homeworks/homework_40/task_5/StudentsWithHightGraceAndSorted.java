package homeworks.homework_40.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsWithHightGraceAndSorted {
    public static void main(String[] args) {
       Student student1 = new Student("name1", 4.5,2019);
       Student student2 = new Student("name2", 4.6,2010);
       Student student3 = new Student("name3", 4.2,2019);
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

        System.out.println("Students groped by year: ");


        Map<Integer, List<Student>> groupedByYear = students.stream()
                .collect(Collectors.groupingBy(Student::getYearStart));

        groupedByYear.forEach((year, studentList) -> {
            System.out.println("Year: " + year);
            studentList.forEach(System.out::println);
        });
    }
}
