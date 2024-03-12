package homeworks.homework_40.task_6;

import homeworks.homework_40.task_5.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Дана коллекция Person - Имя, возраст, список навыков (например языки программирования)
Нужно найти все уникальные навыки которыми обладают люди старше 25 лет и отсортировать их
 */

public class PersonsSortedByUnikSkills {
    public static void main(String[] args) {

        List<String> skills1 = new ArrayList<>();
        skills1.add("C++");
        skills1.add("Rast");

        List<String> skills2 = new ArrayList<>();
        skills2.add("C++");
        skills2.add("Python");
        skills2.add("Java");

        List<String> skills3 = new ArrayList<>();
        skills3.add("Java");

        List<String> skills4 = new ArrayList<>();
        skills4.add("PHP");
        skills4.add("Python");

        List<String> skills5 = new ArrayList<>();
        skills5.add("C++");
        skills5.add("Java");
        skills5.add("Rast");

        Person person1 = new Person("name1", 32, skills1);
        Person person2 = new Person("name2", 28, skills2);
        Person person3 = new Person("name3", 18, skills3);
        Person person4 = new Person("name4", 32, skills4);
        Person person5 = new Person("name5", 35, skills5);

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


        List<String> personsWithUniqueSkills = persons.stream()
                .filter(person -> person.getAge() > 25)
                .flatMap(person -> person.getSkills().stream())
                .distinct()                                                    //оставляем уникальные только скилы
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Unique skills of people older than 25 sorted alphabetically:");
        System.out.println(personsWithUniqueSkills);

    }
}
