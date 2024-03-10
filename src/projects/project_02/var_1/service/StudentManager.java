package projects.project_02.var_1.service;

import projects.project_02.var_1.entity.Course;
import projects.project_02.var_1.entity.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StudentManager {

    private Map<Integer, Student> studentMap;

    public StudentManager() {
        this.studentMap = new HashMap<>();
    }

    public void addStudent(Student currentStudent){
        studentMap.put(currentStudent.getStudentId(),currentStudent);
    }

    public void removeStudent(Student currentStudent){
        studentMap.remove(currentStudent.getStudentId(),currentStudent);
    }

    // если есть студент, то возвращается Optional,если его нет то пустой Optional
   public Optional<Student> findStudentById(int studentId){
        return Optional.ofNullable(studentMap.get(studentId));
   }

   public void addCourseToStudent(int studentId, Course course){
        Student student = studentMap.get(studentId);
        if (student != null){
            student.addCourse(course);
        }
   }

    public void printStudentsInCourse(Course course){
        for (Student student : studentMap.values()){
            if (student.getCoursesByStudent().contains(course)){
                System.out.println(student.getFirstName() + " " + student.getSecondName());
            }
        }
    }


}
