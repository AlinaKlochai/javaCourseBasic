package homeworks.extraHomework.O_extaHomeworkBasicCourse1.task_12;

public class ArrayServiseTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = 5;

        ArrayService arrayService = new ArrayService();

        boolean result = arrayService.contains(arr,num);
        System.out.println("Contains number " + num + " in array: " + result);
    }
}
