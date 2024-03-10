package homeworks.homework_36.Optional.task_4;

import java.util.Optional;

public class StringSize {
    public static Optional<String> getSizeOfSting (String currentString){
        if (currentString.isBlank()){
            return Optional.of("This string is empty");
        }else {
            return Optional.of("This string has " + currentString.length() + " size");
        }
    }

    public static void main(String[] args) {
        String emptyString = "";
        String nonEmptyString = "Cat";

        System.out.println("Size of empty string: " + getSizeOfSting(emptyString));
        System.out.println("Size of non empty string: " + getSizeOfSting(nonEmptyString));
    }

}
