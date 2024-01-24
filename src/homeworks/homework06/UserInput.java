package homeworks.homework06;

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
