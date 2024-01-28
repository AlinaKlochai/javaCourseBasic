package homeworks.homework08;

public class BookDemo {
    public static void main(String[] args) {
        BookManager manager = new BookManager();

        Book book1 = manager.createBook();

        System.out.println(book1);
    }
}
