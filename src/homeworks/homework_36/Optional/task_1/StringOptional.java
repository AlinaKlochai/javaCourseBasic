package homeworks.homework_36.Optional.task_1;

import java.util.List;
import java.util.Optional;

public class StringOptional {

    public static String getFirstString(List<String> stringList){
        if (stringList.isEmpty()){
            return "";
        }else {
            return stringList.getFirst();
        }
    }
}
