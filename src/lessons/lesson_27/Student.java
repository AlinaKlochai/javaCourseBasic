package lessons.lesson_27;

public class Student {

    private String nameOfStudent;
    private int studentId;

    public Student(String nameOfStudent, int studentId) {
        this.nameOfStudent = nameOfStudent;
        this.studentId = studentId;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
