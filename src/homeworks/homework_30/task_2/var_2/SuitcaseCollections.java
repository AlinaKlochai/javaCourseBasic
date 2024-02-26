package homeworks.homework_30.task_2.var_2;



import java.util.*;

public class SuitcaseCollections {
    public static void main(String[] args) {

        Comparator<Suitcase> suitcaseComparator = new SuitcaseComparatorSize().thenComparing(new SuitcaseComparatorMaterial().thenComparing(new SuitcaseComparatorColor()));
       Set<Suitcase> treeSet = new TreeSet<>(suitcaseComparator);

       treeSet.add(new Suitcase("Plastic","XL","Yellow"));
       treeSet.add(new Suitcase("Plastic","XL","White"));
       treeSet.add(new Suitcase("Textiles","L","Black"));
       treeSet.add(new Suitcase("Textiles","M","Yellow"));
       treeSet.add(new Suitcase("Textiles","M","Black"));

        System.out.println("Чемоданы, отсортированные в TreeSet 1.по размеру 2.по материалу 3.по цвету:");

        for (Suitcase suitcase : treeSet){
            System.out.println(suitcase);
        }

        List<Suitcase> linkedList = new LinkedList<>();

        linkedList.add(new Suitcase("Plastic","XL","Yellow"));
        linkedList.add(new Suitcase("Plastic","XL","White"));
        linkedList.add(new Suitcase("Textiles","L","Black"));
        linkedList.add(new Suitcase("Textiles","M","Yellow"));
        linkedList.add(new Suitcase("Textiles","M","Black"));

        System.out.println("Не отсортированныйи Linkedlist");
        for (Suitcase suitcase : linkedList) {
            System.out.println(suitcase);
        }

        System.out.println("Отсортированный LinkedList:");

        linkedList.sort(new SuitcaseCompare());

        for (Suitcase suitcase : linkedList){
            System.out.println(suitcase);
        }



    }
}
