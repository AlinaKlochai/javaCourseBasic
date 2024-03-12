package homeworks.homework_40.task_1;

public class Student {
    private String name;
    private int age;
    private double avgGrace;

    public Student(String name, int age, double avgGrace) {
        this.name = name;
        this.age = age;
        this.avgGrace = avgGrace;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAvgGrace() {
        return avgGrace;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgGrace=" + avgGrace +
                '}';
    }
}
