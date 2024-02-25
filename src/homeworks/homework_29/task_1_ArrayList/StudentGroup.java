package homeworks.homework_29.task_1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public static void main(String[] args) {
        Student student1 = new Student("Amanda","Redison");
        Student student2 = new Student("Ralph","Well");
        Student student3 = new Student("Ben","Hope");
        Student student4 = new Student("Nana","Kenn");
        Student student5 = new Student("David","Red");

        //Добавьте в список пять имен студентов.

        List<Student> studentGroup = new ArrayList<>();
        studentGroup.add(student1);
        studentGroup.add(student2);
        studentGroup.add(student3);
        studentGroup.add(student4);
        studentGroup.add(student5);

        System.out.println("Список студентов: " );
        for (Student student : studentGroup ){
            System.out.println(student.getFirstName() + " " + student.getSecondName());
        }

        //Выведите список студентов в обратном порядке.

        System.out.println("Список студентов в обратном порядке:");

        for (int i = studentGroup.size() - 1; i >= 0 ; i--) {
            Student currentStudent = studentGroup.get(i);
            System.out.println(currentStudent.getFirstName() + " " + currentStudent.getSecondName());

        }

        //Удалите студента из списка по индексу и выведите обновленный список.

        studentGroup.remove(3);
        System.out.println("Список студентов без одного студента: " );
        for (Student student : studentGroup ){
            System.out.println(student.getFirstName() + " " + student.getSecondName());
        }

    }
}
