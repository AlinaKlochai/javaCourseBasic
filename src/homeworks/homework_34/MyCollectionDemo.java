package homeworks.homework_34;

public class MyCollectionDemo {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        Element element1 = new Element("Cat");
        Element element2 = new Element("Dog");

        myCollection.removeElementByIndex(2);

        myCollection.addElementInEnd(element1);
        myCollection.addElementInEnd(element2);
        System.out.println("Коллекция после добавления елементов: ");
        myCollection.printCollection();
        System.out.println("___________________");

        Element element3 = new Element("Maus");
        System.out.println("Коллекция после добавления нового елемента по индексу 0: ");
        myCollection.addElementByIndex(0,element3);
        myCollection.printCollection();

        System.out.println("-------------------");
        int sizeOfMyCollection = myCollection.sizeOfList();

        System.out.println(sizeOfMyCollection);
        myCollection.removeElementByIndex(1);
        myCollection.printCollection();
        int sizeOfMyCollection2 = myCollection.sizeOfList();
        System.out.println(sizeOfMyCollection2);

        myCollection.addElementByIndex(5,new Element("Maus"));
        myCollection.printCollection();


    }
}
