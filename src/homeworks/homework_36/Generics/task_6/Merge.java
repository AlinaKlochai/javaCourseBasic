package homeworks.homework_36.Generics.task_6;

import java.util.ArrayList;
import java.util.List;


public class Merge<T,S> {


    public List<T> merge(List<T> sortedList1, List<S>sortedList2){
        List<T> mergeList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < sortedList1.size()){
            mergeList.add(sortedList1.get(i));
            i++;
        }

        while (j < sortedList2.size()){
            mergeList.add((T) sortedList2.get(j));
            j++;
        }

        return mergeList;

    }

    public static void main(String[] args) {

        Merge<Integer,Integer> merge = new Merge<>();

        List<Integer> list1 = List.of(12,34,51,72,92);
        List<Integer> list2 = List.of(21,44,65,87,100);

        List<Integer> mergedList = merge.merge(list1,list2);
        System.out.println(mergedList);

        Merge<String,Integer> stringIntegerMerge = new Merge<>();
        List<String> stringList = List.of("Cat","Dog");

        List<String> mergedList2 = stringIntegerMerge.merge(stringList,list1);
        System.out.println(mergedList2);
    }
}
