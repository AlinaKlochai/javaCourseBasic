package homeworks.homework_36.Collections.task_2_5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("titel1","author1",1990);
        Book book2 = new Book("titel2","author2",1995);
        Book book3 = new Book("titel3","author3",2000);
        Book book4 = new Book("titel4","author4",2005);
        Book book5 = new Book("titel5","author5",2010);

        List<Book> books = new LinkedList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("All books:");
        printList(books);

        System.out.println("All books after 2000 year:");
        removeAllBooksBefore2000(books);
        printList(books);

    }

    public static void printList(List<Book> books){
        for (Book book : books){
            System.out.println(book);
        }
    }

    public static void removeAllBooksBefore2000(List<Book> books){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if(book.getYear() < 2000){
                iterator.remove();
            }
        }
    }
}
