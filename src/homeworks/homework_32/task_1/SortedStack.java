package homeworks.homework_32.task_1;

import java.util.Stack;

public class SortedStack {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();

        integers.push(2);
        integers.push(5);
        integers.push(7);
        integers.push(10);
        integers.push(6);

        System.out.println("Наша коллекция до сортировки");
        System.out.println(integers);

        sortStackCollections(integers);
        System.out.println("Наша коллекция после сортировки");
        System.out.println(integers);

    }

    public static void sortStackCollections(Stack<Integer> integers) {
        // создаем временный стек, который мы использум потом для сортировки
        Stack<Integer> tempStack = new Stack<>();

        while (!integers.isEmpty()) {
            int currentInt = integers.pop();
            // пока tempStack не пустой и верхний элемент меньше currentInt,
            // то currentInt становится главным элементом
            while (!tempStack.isEmpty() && tempStack.peek() < currentInt) {      // когда берем 10,6 извлекается из стека integers
                integers.push(tempStack.pop());                                  //и добавляется в него, после чего 10 извлекается из
            }                                                                    //временного стека и добавляется в стек integers
            tempStack.push(currentInt);
        }

        while (!tempStack.isEmpty()) {
            integers.push(tempStack.pop());      // обратно из tempStack в обратном порядке ложим в integers
        }
    }
}
