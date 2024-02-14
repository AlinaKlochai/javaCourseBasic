package homeworks.homework_21.inheritance.task_3;

import java.util.Arrays;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] subordinates = {
                new Employee("Melinda","Frog",2500),
                new Employee("Ben","Hocking",3500),
                new Employee("David","Ronald",2700)
        };
        Manager manager = new Manager("Jack","Medison",4000,subordinates);

        String[] project = {"Project Sky", "Project Water"};
        Developer developer = new Developer("Ralf","Wolly",4300,project);

        System.out.println("Manager: " + manager.getFirstName() + " " + manager.getLastName());
        System.out.println("Subordinates: ");
        for (int i = 0; i < manager.getSubordinates().length; i++) {
            System.out.println("< " + manager.getSubordinates()[i].getFirstName() + " " + manager.getSubordinates()[i].getLastName());

        }

        System.out.println("Developer: " + developer.getFirstName() + " " + developer.getLastName());
        System.out.println("Projects: ");
        String[] projects = developer.getProjects();
        for (int i = 0; i < projects.length; i++) {
            System.out.println("> " + projects[i]);
        }

    }
}
