package homeworks.homework_38.task_5;

public class IsNumberSimple {
    public static void main(String[] args) {

        CheckingNumber checkingNumber = (int number) -> {
            if (number % 2 == 0){
                return true;
            }
            return false;
        };

        int number1 = 2;
        int number2 = 3;

        System.out.println("Number " + number1 + " is a simple: " + checkingNumber.checkingNumber(number1));
        System.out.println("Number " + number2 + " is a simple: " + checkingNumber.checkingNumber(number2));
    }
}
