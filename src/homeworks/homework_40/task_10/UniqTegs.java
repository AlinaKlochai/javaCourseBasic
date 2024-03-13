package homeworks.homework_40.task_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Дан список объектов Book, содержащий информацию о книгах, включая название, автора и список тегов.
Необходимо получить список всех уникальных тегов
 */
public class UniqTegs {
    public static void main(String[] args) {

        List<String> tegs1 = Arrays.asList("teg1","teg2");
        List<String> tegs2 = Arrays.asList("teg1","teg3");
        List<String> tegs3 = Arrays.asList("teg4","teg2");

        Book book1 = new Book("name1","author1",tegs1);
        Book book2 = new Book("name2","author2",tegs2);
        Book book3 = new Book("name3","author3",tegs3);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        List<String> uniqTegs = books.stream()
                .flatMap(book -> book.getTegs().stream())
                .distinct()
                .toList();

        System.out.println(uniqTegs);

    }
}
