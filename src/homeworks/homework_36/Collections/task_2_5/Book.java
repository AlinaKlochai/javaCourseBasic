package homeworks.homework_36.Collections.task_2_5;

public class Book {
    private String titel;
    private String author;
    private int year;

    public Book(String titel, String author, int year) {
        this.titel = titel;
        this.author = author;
        this.year = year;
    }

    public String getTitel() {
        return titel;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titel='" + titel + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
