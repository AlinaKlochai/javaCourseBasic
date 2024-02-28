package lessons.lesson_31.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ModeficationWithListOfString {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Monday");
        strings.add("Thursday");
        strings.add("Wednesday");
        strings.add("Thursday");
        strings.add("Friday");
        strings.add("Saturday");
        strings.add("Sunday");

        System.out.println("Строка без изменений: ");
        System.out.println(strings);

        replaceString(strings,"day","...");

        System.out.println("Модефицированная коллеция: ");
        System.out.println(strings);

    }
    public static void replaceString(List<String> strings, String checkContain,String replaced){
        ListIterator<String> stringIterator = strings.listIterator();
        while (stringIterator.hasNext()) {
            String currentString = stringIterator.next();
            System.out.println(currentString);
            if (currentString.equals(checkContain)){
                stringIterator.set(replaced);
            }
        }
    }


}
