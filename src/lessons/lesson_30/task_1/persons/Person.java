package lessons.lesson_30.task_1.persons;

public class Person implements Comparable<Person> {
    private String firstName;
    private String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person personForComparable) {
        int comparableResult = getFirstName().compareTo(personForComparable.getFirstName());
        if (comparableResult == 0){
           comparableResult = getSecondName().compareTo(personForComparable.getSecondName());
        }
        return comparableResult;
    }
}
