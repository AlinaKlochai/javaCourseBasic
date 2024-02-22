package homeworks.extraHomework.O_extaHomeworkBasicCourse1.task_6;

import scanner.UserInput;

class NumberUtils {

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int number = userInput.inputInteger("Введите число на проверку четности/нечетности: ");

        NumberUtils numberUtils = new NumberUtils();
        numberUtils.isEven(number);

    }

    public boolean isEven(int number){
        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное");
            return true;
        } else {
            System.out.println("Число " + number + " нечетное");
            return false;
        }
    }

}
