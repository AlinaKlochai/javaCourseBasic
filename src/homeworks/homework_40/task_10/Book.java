package homeworks.homework_40.task_10;

import java.util.List;

public class Book {
    private String name;
    private String author;

    private List<String> tegs;

    public Book(String name, String author, List<String> tegs) {
        this.name = name;
        this.author = author;
        this.tegs = tegs;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTegs() {
        return tegs;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", tegs=" + tegs +
                '}';
    }
}
