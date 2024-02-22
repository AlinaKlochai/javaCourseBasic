package homeworks.extraHomework.O_extaHomeworkBasicCourse1.task_12;

public class ArrayService {

    public boolean contains(int[] arr, int numberToSearch){
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == numberToSearch){
                return true;
            }

        }
        return false;

    }
}
