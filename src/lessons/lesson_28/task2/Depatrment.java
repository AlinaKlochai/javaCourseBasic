package lessons.lesson_28.task2;

public class Depatrment {
    private String departmentName;

    public Depatrment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Depatrment{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
