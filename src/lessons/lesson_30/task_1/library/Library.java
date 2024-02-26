package lessons.lesson_30.task_1.library;

import java.util.Set;
import java.util.TreeSet;

public class Library {
    public static void main(String[] args) {
        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book(1,"Том Сойер"));
        bookSet.add(new Book(1,"Винни пух"));
        bookSet.add(new Book(2,"Стихи Пушкина"));
        bookSet.add(new Book(4,"Гарри Поттер"));
        bookSet.add(new Book(6,"Три мушкетера"));

        System.out.println(bookSet);
    }
}
