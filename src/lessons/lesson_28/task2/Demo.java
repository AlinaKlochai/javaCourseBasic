package lessons.lesson_28.task2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Depatrment sales = new Depatrment("Sales");
        Depatrment accounting = new Depatrment("Accounting");

        ArrayList<Depatrment> depatrments = new ArrayList<>();
        depatrments.add(sales);
        depatrments.add(accounting);

        System.out.println("Все департаменты:" );
        System.out.println(depatrments);


        Employee employee1 = new Employee("1","John",sales);
        Employee employee2 = new Employee("2","Amanda",accounting);
        Employee employee3 = new Employee("3","Jams",accounting);
        Employee employee4 = new Employee("4","Lori",sales);
        Employee employee5 = new Employee("5","Johni",sales);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        System.out.println("Все сотрудники: ");
        System.out.println(employees);

        System.out.println("Сотрудники, которые находятся в отделе Sales : ");

        ArrayList<Employee> employeesInSales = new ArrayList<>();
        employeesInSales.add(employee1);
        employeesInSales.add(employee4);
        employeesInSales.add(employee5);

        System.out.println(employeesInSales);

        System.out.println("Сотрудники, которые находятся в отделе Accounting : ");

        ArrayList<Employee> employeesInAccounting = new ArrayList<>();
        employeesInAccounting.add(employee2);
        employeesInAccounting.add(employee3);

        System.out.println(employeesInAccounting);





    }
}
