package homeworks.homework08;

//Написать программу, которая:
//- оперирует объектами книга со следующими параметрами
//- автор
//- название книги
//- количество страниц
//- номер в каталоге
//- параметр который показывает книга в хранилище или на руках

public class Book {
 private String author;
 private String nameOfBook;
 private int numberOfPages;
 private int numberInCatalog;
 private int LocationOfBook;

    public Book(String author, String nameOfBook, int numberOfPages, int numberInCatalog, int LocationOfBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.numberOfPages = numberOfPages;
        this.numberInCatalog = numberInCatalog;
        this.LocationOfBook = LocationOfBook;
    }

    @Override
    public String toString() {
        // если (LocationOfBook == 1), то книга в библеотеке
        // если (LocationOfBook == 0), то книга "на руках"
        return "Book{" +
                "Автор книги: " + author +
                ", Название книги:" + nameOfBook +
                ", Количество страниц в книге: " + numberOfPages +
                ", Номер в каталоге: " + numberInCatalog +
                ", Местонахождение книги ( 1 = в библиотеке/ 0 = нет на месте, на руках) " + LocationOfBook +
                '}';
    }
}
