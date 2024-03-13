package homeworks.homework_41.task_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("name1","department1"),
                new Employee("name2","department2"),
                new Employee("name3","department2"),
                new Employee("name4","department1"),
                new Employee("name5","department1"),
                new Employee("name6","department2")

        );

        Map<String,List<Employee>> employeeGroupByDepartment = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        System.out.println("Employee by department");
        System.out.println(employeeGroupByDepartment);

        Map<String,Long> countEmployeeInDepart = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.counting()));

        System.out.println("Counting employee in department:");
        System.out.println(countEmployeeInDepart);
    }
}
