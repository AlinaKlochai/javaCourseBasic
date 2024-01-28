package homeworks.homework_08;

import scanner.UserInput;

public class BookManager {
    UserInput ui = new UserInput();
    public Book createBook(){

        return new Book(
                ui.inputText("Введите автора книги: "),
                ui.inputText("Введите название книги: "),
                ui.inputInteger("Введите количество страниц в книге: "),
                ui.inputInteger("Введите номер в каталоге: "),
                ui.inputInteger("Есть ли эта книга в библиотеке, если ДА то нажмите 1, если НЕТ то нажмите 0: ")
        );

    }
}
