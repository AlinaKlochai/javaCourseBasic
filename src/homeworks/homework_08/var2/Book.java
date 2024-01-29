package homeworks.homework_08.var2;

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
    private String numberInCatalog;
    private boolean LocationOfBook;

    // создаем конструктор для книги, которая будет только 2 параметра

    public Book(String author, String nameOfBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    // создаем конструктор для книги, которая будет иметь все параметры

    public Book(String author, String nameOfBook, int numberOfPages, String numberInCatalog, boolean locationOfBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.numberOfPages = numberOfPages;
        this.numberInCatalog = numberInCatalog;
        LocationOfBook = locationOfBook;
    }

    // устанавливая СЕТТЕРЫ для тех параметров, которые будем добавлять самостоятельно

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setNumberInCatalog(String numberInCatalog) {
        this.numberInCatalog = numberInCatalog;
    }

    public void setLocationOfBook(boolean locationOfBook) {
        LocationOfBook = locationOfBook;
    }

    // преобразуем полученную ссылку, дабы узнать содержимое нашей книги
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", numberInCatalog=" + numberInCatalog +
                ", LocationOfBook=" + LocationOfBook +
                '}';
    }

}
