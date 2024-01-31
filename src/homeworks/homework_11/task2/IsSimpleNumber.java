package homeworks.homework_11.task2;

public class IsSimpleNumber {

    // создаем метож, который проверяет наше число
    public boolean isSimple(int checkNumber){

        for (int i = 2; i <= checkNumber / 2; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
