package homeworks.homework_21.inheritance.task_3;

public class Developer extends Employee {
    private String[] projects;

    public Developer(String firstName, String lastName, double salary, String[] projects) {
        super(firstName, lastName, salary);
        this.projects = projects;
    }

    public String[] getProjects() {
        return projects;
    }
}
