package homeworks.homework_08.var1_unfinished;

import homeworks.homework_08.var1_unfinished.Book;
import scanner.UserInput;

public class BookManager {
    UserInput ui = new UserInput();
    public Book createBook(){

        return new Book(
                ui.inputText("Введите автора книги: "),
                ui.inputText("Введите название книги: "),
                ui.inputInteger("Введите количество страниц в книге: "),
                ui.inputInteger("Введите номер в каталоге: "),
                ui.inputInteger("Где на данный момент находится книга? ")
        );

    }
}
