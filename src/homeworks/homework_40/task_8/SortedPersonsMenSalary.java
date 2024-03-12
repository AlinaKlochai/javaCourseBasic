package homeworks.homework_40.task_8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/*
Дан список объектов Person, содержащий информацию о людях, включая имя, возраст, пол и зарплату.
Необходимо найти среднюю зарплату всех мужчин в возрасте от 25 до 40 лет.
 */

public class SortedPersonsMenSalary {
    public static void main(String[] args) {
        Person person1 = new Person("M","John",18,1000);
        Person person2 = new Person("M","Johny",27,3000);
        Person person3 = new Person("M","Mike",35,5000);
        Person person4 = new Person("M","Kile",38,4800);
        Person person5 = new Person("W","Jehny",27,2500);
        Person person6 = new Person("M","George",55,5500);

        List<Person> persons = new ArrayList<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        System.out.println("All persons:");
        for (Person person : persons){
            System.out.println(person);
        }

        OptionalDouble averageSalary = persons.stream()
                .filter(person -> person.getSex().equals("M"))
                .filter(person -> person.getAge() > 25 && person.getAge() < 40)
                .mapToInt(Person::getSalary)                                           // достали из Persons salary
                .average();                                                            // average(), вычисляет среднее значение всех элементов в потоке

        if (averageSalary.isPresent()) {
            System.out.println("Average salary of men aged 25 to 40: " + averageSalary.getAsDouble());
        } else {
            System.out.println("No men aged 25 to 40 found.");
        }

    }
}
