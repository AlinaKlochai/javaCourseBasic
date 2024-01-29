package homeworks.homework_08.var1_unfinished;

/* Задача 1.
Написать программу, которая:
- оперирует объектами книга со следующими параметрами
- автор
- название книги
- количество страниц
- номер в каталоге
- параметр который показывает книга в хранилище или на руках

Нужно уметь создавать новые книги двумя способами:
- либо указывать только автора и название книги
  в этом случае недостающе при создании книги данные добавляются отдельно
- либо полностью все параметры

Написать отдельные сервисные методы которые:
- создают новую книгу только с автором и названием
- создают новую книгу с использованием всех параметров
- редактирует книгу добавляя: номер каталога, количество страниц и где книга находится
- который вывод подробно информацию о книге
*/

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberInCatalog() {
        return numberInCatalog;
    }

    public void setNumberInCatalog(int numberInCatalog) {
        this.numberInCatalog = numberInCatalog;
    }

    public int getLocationOfBook() {
        return LocationOfBook;
    }

    public void setLocationOfBook(int locationOfBook) {
        LocationOfBook = locationOfBook;
    }




    @Override
    public String toString() {
        // если (LocationOfBook > 0 ), то книга в библеотеке
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
