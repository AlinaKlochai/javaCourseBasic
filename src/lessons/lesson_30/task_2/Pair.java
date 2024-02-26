package lessons.lesson_30.task_2;

import java.util.Objects;

public class Pair {
    private String name;
    private int age;

    public Pair(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return age == pair.age && Objects.equals(name, pair.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
