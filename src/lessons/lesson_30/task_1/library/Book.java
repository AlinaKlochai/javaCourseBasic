package lessons.lesson_30.task_1.library;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private int id;
    private String nameBook;

    public Book(int id, String nameBook) {
        this.id = id;
        this.nameBook = nameBook;
    }

    public int getId() {
        return id;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }

    public int compareTo(Book bookForCompare) {

        int compareResult = getId() - bookForCompare.getId();

        if (compareResult == 0) {
            compareResult = getNameBook().compareTo(bookForCompare.getNameBook());
        }

        return compareResult;
    }
}
