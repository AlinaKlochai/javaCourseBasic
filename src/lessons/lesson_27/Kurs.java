package lessons.lesson_27;

import java.util.List;

public class Kurs {
    private String nameOfKurs;
    private Mentor mentors;
    List<Student> students;

    public Kurs(String nameOfKurs, Mentor mentors, List<Student> students) {
        this.nameOfKurs = nameOfKurs;
        this.mentors = mentors;
        this.students = students;
    }

    public void addStudent(Student student){

    }
}
