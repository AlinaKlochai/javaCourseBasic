package homeworks.homework_36.Collections.task_1_6;

import java.util.PriorityQueue;
/*
Создать PriorityQueue из 10 элементов типа Integer, добавить несколько элементов, извлечь минимальный элемент и вывести на экран.
 */
public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(10);
        priorityQueue.offer(3);
        priorityQueue.offer(2);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);

        int minElement = priorityQueue.poll();

        System.out.println("Минимальный елемент из очереди: " + minElement);

    }
}
