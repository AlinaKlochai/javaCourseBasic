package homeworks.homework_38.task_6;

import java.util.List;

@FunctionalInterface
public interface CombineList<T> {
    public List<T> combineList(List<T> list1, List<T> list2);
}
