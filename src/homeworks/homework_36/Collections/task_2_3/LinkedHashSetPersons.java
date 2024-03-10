package homeworks.homework_36.Collections.task_2_3;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPersons {
    public static void main(String[] args) {
        LinkedHashSet<Person> persons = new LinkedHashSet<>();

        persons.add(new Person("Conni",23));
        persons.add(new Person("David",33));
        persons.add(new Person("Frank",25));
        persons.add(new Person("Meggi",37));
        persons.add(new Person("Megan",42));

        System.out.println("All persons: ");
        System.out.println(persons);

        System.out.println("Persons after 30 years old:");
        LinkedHashSet<Person> personsAfter30 = getAllPersonsAfter30(persons);
        System.out.println(personsAfter30);


    }

    public static LinkedHashSet<Person> getAllPersonsAfter30(LinkedHashSet<Person> persons){
        LinkedHashSet<Person> personsAfter30 = new LinkedHashSet<>();
        for (Person person : persons){
            if(person.getAge() > 30){
                personsAfter30.add(person);
            }
        }
        return personsAfter30;
    }
}
