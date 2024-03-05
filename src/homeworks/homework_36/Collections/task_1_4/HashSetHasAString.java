package homeworks.homework_36.Collections.task_1_4;

import java.util.HashSet;
import java.util.Set;

/*
Создать HashSet, добавить в него несколько строк и проверить, содержит ли он определенную строку.
 */

public class HashSetHasAString {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Cat");
        stringSet.add("Dog");
        stringSet.add("Fish");

        String searchString = "Dog1";
        if (stringSet.contains(searchString)){
            System.out.println("Текущая коллеция имеет заданную строку");
        }else {
            System.out.println("Текущая коллеция не имеет заданную строку");
        }
    }
}
