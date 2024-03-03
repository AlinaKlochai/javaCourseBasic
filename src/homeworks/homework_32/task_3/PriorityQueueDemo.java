package homeworks.homework_32.task_3;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue(4,1);
        priorityQueue.enqueue(6,5);
        priorityQueue.enqueue(3,10);
        priorityQueue.enqueue(10,2);
        priorityQueue.enqueue(1,3);

        priorityQueue.printQueue();

        priorityQueue.dequeue();
        priorityQueue.printQueue();
    }
}
