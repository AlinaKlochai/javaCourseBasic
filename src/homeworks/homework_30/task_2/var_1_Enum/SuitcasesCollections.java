package homeworks.homework_30.task_2.var_1_Enum;

import java.util.*;

public class SuitcasesCollections {
    public static void main(String[] args) {
        Set<Suitcase> treeSet = new TreeSet<>();

        treeSet.add(new Suitcase(Materials.Plastic,Sizes.XL,Colors.Yellow));
        treeSet.add(new Suitcase(Materials.Plastic,Sizes.XL,Colors.White));
        treeSet.add(new Suitcase(Materials.Textiles,Sizes.L,Colors.Black));
        treeSet.add(new Suitcase(Materials.Textiles,Sizes.M,Colors.Yellow));
        treeSet.add(new Suitcase(Materials.Textiles,Sizes.M,Colors.Black));
        System.out.println("Чемоданы, отсортированные в TreeSet:");
        for (Suitcase suitcase : treeSet) {
            System.out.println(suitcase);
        }

        List<Suitcase> linkedList = new LinkedList<>();
        linkedList.add(new Suitcase(Materials.Plastic,Sizes.XL,Colors.Yellow));
        linkedList.add(new Suitcase(Materials.Plastic,Sizes.XL,Colors.White));
        linkedList.add(new Suitcase(Materials.Textiles,Sizes.L,Colors.Black));
        linkedList.add(new Suitcase(Materials.Textiles,Sizes.M,Colors.Yellow));
        linkedList.add(new Suitcase(Materials.Textiles,Sizes.M,Colors.Black));

        System.out.println("Чемоданы, отсортированные в LinkedList:");
        Collections.sort(linkedList);
        for (Suitcase suitcase : linkedList) {
            System.out.println(suitcase);
        }

        //элементы linkedList сортируются по
        // их естественному порядку с использованием
        // метода compareTo(), который мы определили в классе Suitcase

    }
}
