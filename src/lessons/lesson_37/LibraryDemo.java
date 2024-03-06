package lessons.lesson_37;

import lessons.lesson_37.task_1.Book;
import lessons.lesson_37.task_1.Genre;
import lessons.lesson_37.task_1.Library;

import java.util.List;

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        Genre roman = new Genre("Roman");
        Genre fantasy = new Genre("Fantasy");

        library.addBook(new Book("Name1",roman));
        library.addBook(new Book("Name2",roman));

        library.addBook(new Book("Name3",fantasy));
        library.addBook(new Book("Name4",fantasy));

        List<Book> romanBooks = library.getBooksByGenre(roman);
        List<Book> fantasyBooks = library.getBooksByGenre(fantasy);

        System.out.println(romanBooks);
        System.out.println(fantasyBooks);


    }
}
