package homeworks.homework_36.Generics.task_4;

public class FindMaxDemo {
    public static void main(String[] args) {

        Integer[] integers = {37,78,1,34,67};
        Double[] doubles = {3.4,2.6,1.0,6.5,3.2};
        String[] strings = {"cat","small dog","fish","hamster"};

        System.out.println("Максимальный елемент из массива integers: " + FindMax.findMax(integers));
        System.out.println("Максимальный елемент из массива doubles: " + FindMax.findMax(doubles));
        System.out.println("Максимальный елемент из массива strings: " + FindMax.findMax(strings));

    }
}
