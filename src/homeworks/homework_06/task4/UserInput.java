package homeworks.homework_06.task4;

import java.util.Scanner;

public class UserInput {
    public String inputName(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        String inputText = scanner.nextLine();
        scanner.close();
        return inputText;

    }
}
