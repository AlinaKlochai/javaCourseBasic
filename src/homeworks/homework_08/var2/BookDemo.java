package homeworks.homework_08.var2;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Маргарет Митчен","Унесенные ветром", 1037, "У-127", true );
        Book book2 = new Book("Марк Твен", "Приключения Тома Соера");
        Book book3 = new Book("Джоан Роклинг", "Гарри Поттер");

        // добавляем недостающие параметры самостоятельно
        book3.setNumberOfPages(500);
        book3.setNumberInCatalog("Г-254");
        book3.setLocationOfBook(false);

        System.out.println("Информация о первой книге: ");
        System.out.println(book1);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Информация о второй книге: ");
        System.out.println(book2);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Информация о третей книге: ");
        System.out.println(book3);
    }
}
