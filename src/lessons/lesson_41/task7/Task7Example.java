package lessons.lesson_41.task7;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7Example{
    /*
Студент записывает книги которые прочитал,
задача вывести все прочитанные книги у всех студентов
(в качестве дополнения, применить фильтр на тему: найти книги которые не содержат HTML)
 */

    public static void main(String[] args) {
        Student student1 = new Student("Alex");
        student1.addBook("Java 8 vs Java 21");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student("Thomas");
        student2.addBook("HTML introducing");
        student2.addBook("Effective Java");

        List<Student> studentList = Arrays.asList(student1,student2);

        List<String> booksListed = studentList.stream()
                .flatMap(student -> student.getBook().stream())
                .distinct()
                .toList();

        System.out.println(booksListed);

        List<String> booksListed2 = studentList.stream()
                .flatMap(student -> student.getBook().stream())
                .distinct()
                .filter(book -> !book.contains("HTML"))
                .toList();

        System.out.println(booksListed2);





    }
}
