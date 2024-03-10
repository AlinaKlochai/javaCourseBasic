package projects.project_02.var_1.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String nameOfCourse;
    private List<Student> studentsInThisCourse;

    public Course(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
        this.studentsInThisCourse = new ArrayList<>();
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public List<Student> getStudentsInThisCourse() {
        return studentsInThisCourse;
    }

    //для более удобного пользования добавления нового студента в список студентов, на курсе
    public void addStudent(Student student){
        studentsInThisCourse.add(student);
    }

    public void removeStudent(Student student){
        studentsInThisCourse.remove(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "nameOfCourse='" + nameOfCourse + '\'' +
                ", studentsInThisCourse=" + studentsInThisCourse +
                '}';
    }
}
