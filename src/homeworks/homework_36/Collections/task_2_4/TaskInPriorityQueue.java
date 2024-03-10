package homeworks.homework_36.Collections.task_2_4;

import java.util.PriorityQueue;

public class TaskInPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.add(new Task("task3",3));
        tasks.add(new Task("task5",5));
        tasks.add(new Task("task1",1));
        tasks.add(new Task("task2",2));
        tasks.add(new Task("task4",4));
        System.out.println(tasks);

        while (!tasks.isEmpty()){
            Task task = tasks.poll();
            System.out.println("Next task: " + task.getName() + ", Priority: " + task.getPriority());
        }
    }
}
