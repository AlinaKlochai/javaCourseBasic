package lessons.lesson_30.task_1.persons;

import lessons.lesson_30.task_1.library.Book;

import java.util.Set;
import java.util.TreeSet;

public class PersonsDemo {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();

        personSet.add(new Person("Amanda","Hope"));
        personSet.add(new Person("Amanda","Lupe"));
        personSet.add(new Person("Jake","Hope"));
        personSet.add(new Person("Tomas","John"));
        System.out.println(personSet);

    }
}
