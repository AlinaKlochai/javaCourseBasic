package lessons.lesson_32.task_2_Queue;


import java.util.LinkedList;
import java.util.Queue;

public class BrouserHistory {
    public static void main(String[] args) {

        Queue<String> history = new LinkedList<>();
        System.out.println("История браузера в начале работы:");

        System.out.println(history);
        history.add("history 1");
        history.add("history 2");
        history.add("history 3");
        history.add("history 4");
        history.add("history 5");

        System.out.println("Вся история браузера за один час: ");
        for (String currentHistory : history) {
            System.out.println(currentHistory);
        }


    }
}
