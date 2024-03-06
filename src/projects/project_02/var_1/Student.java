package projects.project_02.var_1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String secondName;
    private int studentId;
    private List<Course> coursesByStudent;

    public Student(String firstName, String secondName, int studentId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.studentId = studentId;
        this.coursesByStudent = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getCoursesByStudent() {
        return coursesByStudent;
    }

    //для более удобного пользования добавления нового курса в список курсов, на которые записан студент
    public void addCourse(Course course){
        coursesByStudent.add(course);
    }

    public void removeCourse(Course course){
        coursesByStudent.remove(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", studentId=" + studentId +
                ", coursesByStudent=" + coursesByStudent +
                '}';
    }
}
