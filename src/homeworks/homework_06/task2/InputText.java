package homeworks.homework_06.task2;

import java.util.Scanner;

public class InputText {
    public String inputTextFroKeyboard(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();

        return userText;


    }
}
