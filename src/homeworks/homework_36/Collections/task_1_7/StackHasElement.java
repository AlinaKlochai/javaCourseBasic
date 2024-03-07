package homeworks.homework_36.Collections.task_1_7;

import java.util.Stack;

public class StackHasElement {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();

        stack.push(4);
        stack.push(3);
        stack.push(2);

        StackHasElement stackHasElement = new StackHasElement();

        stackHasElement.searchElement(stack,4);
        stackHasElement.searchElement(stack,1);

        System.out.println("---------------------------------------");

        Stack<String> strings = new Stack<>();
        strings.push("cat");
        strings.push("dog");
        stackHasElement.searchElement(strings,"dog");
        stackHasElement.searchElement(strings,"fish");



    }

        public <T> void searchElement(Stack<T> stack, T searchElement) {
            if (stack.search(searchElement) < 0) {
                System.out.println("Данный елемент " + searchElement + " отсудствует в стеке");
            } else {
                System.out.println("Данный елемент присудствует в стеке");
                System.out.println("Eго глубина: " + stack.search(searchElement));
            }
        }

}
