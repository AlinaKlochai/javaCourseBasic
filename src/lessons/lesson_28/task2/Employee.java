package lessons.lesson_28.task2;

public class Employee {
    private String id;
    private String name;

    private Depatrment depatrment;

    public Employee(String id, String name, Depatrment depatrment) {
        this.id = id;
        this.name = name;
        this.depatrment = depatrment;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Depatrment getDepatrment() {
        return depatrment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
