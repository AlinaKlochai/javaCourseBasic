package homeworks.homework_40.task_8;

public class Person {
    private String sex;
    private String name;
    private int age;
    private int salary;

    public Person(String sex, String name, int age, int salary) {
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
