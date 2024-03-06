package lessons.lesson_37.task_1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    Map<Genre, List<Book>> booksByGenre;

    public Library() {
        this.booksByGenre = new HashMap<>();
    }

    public void addBook(Book book){
        Genre genre = book.getGenre();
        if(!booksByGenre.containsKey(genre)){
            booksByGenre.put(genre,new ArrayList<>());
        }
        booksByGenre.get(genre).add(book);
    }

    public List<Book> getBooksByGenre(Genre genre) {
        return booksByGenre.getOrDefault(genre, new ArrayList<>());
    }
}
