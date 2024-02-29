package homeworks.homework_32.task_2;


import java.util.LinkedList;
import java.util.Queue;
    public class QueueRotation {
        public static void main(String[] args) {

            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);



            System.out.println("Исходная очередь:  ");
            System.out.println(queue);
            int k = 1;
            rotateQueue(queue,k);
            System.out.println("Очередь после " + k + " ротаций: ");
            System.out.println(queue);

        }
        public static void rotateQueue(Queue<Integer> queue, int k){

            if ((queue == null) || (k < 0) || queue.isEmpty() ){
                System.out.println("Невозможно выполнить ротации");
            }
            for (int i = 0; i < k; i++) {
                //Извлекаем последний элемент и помещаем его в конец очереди
                    int lastElement = queue.poll();
                    queue.offer(lastElement);
            }
        }

    }

