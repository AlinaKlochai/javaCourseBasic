package homeworks.homework_32.task_3;

import homeworks.homework_33.task_2.Product;

import java.util.LinkedList;
import java.util.Map;

public class PriorityQueue {

    private LinkedList<PriorityElement> list;

    public PriorityQueue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(int element, int priority){
        if (list.isEmpty() || priority <= list.getLast().getPriority()){
            list.add(new PriorityElement(element, priority));
        } else {
            int indexInsert = 0;

            while (indexInsert < list.size() && priority <= list.get(indexInsert).getPriority()) {
                indexInsert++;
            }

            list.add(indexInsert, new PriorityElement(element, priority));
        }
    }

    public Integer dequeue(){
        System.out.println("Удалили елемент с найвысшим приоритетом.");
        if (list.isEmpty()) {
            return null;
        }
        return list.poll().getElement();
    }

    public void printQueue(){
        System.out.println("Все елементы в каталоге отсортированы по приоритету: ");
        for (PriorityElement element : list){
            System.out.println("Приоритет " + element.getPriority() + " , елемент " + element.getElement());
        }
    }

}
