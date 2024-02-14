package homeworks.homework_21.inheritance.task_3;

import java.util.List;

public class Manager extends Employee{
    private Employee[] subordinates;

    public Manager(String firstName, String lastName, double salary, Employee[] subordinates) {
        super(firstName, lastName, salary);
        this.subordinates = subordinates;
    }

    public Employee[] getSubordinates() {
        return subordinates;
    }
}
