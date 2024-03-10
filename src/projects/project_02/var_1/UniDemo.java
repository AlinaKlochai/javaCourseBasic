package projects.project_02.var_1;

import projects.project_02.var_1.entity.Course;
import projects.project_02.var_1.entity.Student;
import projects.project_02.var_1.service.StudentManager;

import java.util.Optional;

public class UniDemo {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        //создание студентов
        Student student1 = new Student("James","Bond",1);
        Student student2 = new Student("John","Week",2);
        Student student3 = new Student("Kevin","Hope",3);
        Student student4 = new Student("Jenni","Bonn",4);
        Student student5 = new Student("Lusinda","Nope",5);

        Course course1 = new Course("Java Basic");
        Course course2 = new Course("Front End");
        Course course3 = new Course("Back End");

        // добавление студентов на курсы
        course1.addStudent(student1);
        course1.addStudent(student4);

        studentManager.addStudent(student1);
        studentManager.addStudent(student4);
        studentManager.addStudent(student3);


        studentManager.addCourseToStudent(1,course1);
        studentManager.addCourseToStudent(4,course1);
        studentManager.addCourseToStudent(3,course1);


        course2.addStudent(student2);
        course2.addStudent(student5);

        studentManager.addStudent(student2);
        studentManager.addStudent(student5);
        studentManager.addCourseToStudent(2,course2);
        studentManager.addCourseToStudent(5,course2);

        course3.addStudent(student3);
        course3.addStudent(student1);

        studentManager.addStudent(student3);
        studentManager.addStudent(student1);
        studentManager.addCourseToStudent(3,course3);
        studentManager.addCourseToStudent(1,course3);

        //забрали студента полностью
        studentManager.removeStudent(student3);



        System.out.println("Students in " + course1.getNameOfCourse() + " course:");
        studentManager.printStudentsInCourse(course1);

        System.out.println("Students in " + course2.getNameOfCourse() + " course:");
        studentManager.printStudentsInCourse(course2);

        System.out.println("Students in " + course3.getNameOfCourse() + " course:");
        studentManager.printStudentsInCourse(course3);


        // Проверяем, найден ли студент при Optional
        //проверяем содержимое Optional

        int studentIdToFind = 2;

        Optional<Student> optionalStudent = studentManager.findStudentById(studentIdToFind);

        if (optionalStudent.isPresent()) {
            Student foundStudent = optionalStudent.get();
            // Теперь вы можете использовать найденного студента
            System.out.println("Found student: " + foundStudent.getFirstName() + " " + foundStudent.getSecondName());
        } else {
            System.out.println("Student with ID " + studentIdToFind + " not found.");
        }





    }
}
