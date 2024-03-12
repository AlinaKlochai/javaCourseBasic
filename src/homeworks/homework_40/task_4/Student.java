package homeworks.homework_40.task_4;

public class Student {

    private String name;
    private double grace;
    private int yearStart;

    public Student(String name, double grace, int yearStart) {
        this.name = name;
        this.grace = grace;
        this.yearStart = yearStart;
    }

    public String getName() {
        return name;
    }

    public double getGrace() {
        return grace;
    }

    public int getYearStart() {
        return yearStart;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grace=" + grace +
                ", yearStart=" + yearStart +
                '}';
    }

}
