package homeworks.homework_21.inheritance.task_3;

/*
Создайте класс `Employee`, содержащий общую информацию о сотрудниках компании.
От него наследуйте классы `Manager` и `Developer`. В классе `Manager`
добавьте список подчиненных - массив сотрудников (экземпляры класса Employee),
а в классе `Developer` - список проектов, над которыми работает разработчик - массив String[].

 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}
