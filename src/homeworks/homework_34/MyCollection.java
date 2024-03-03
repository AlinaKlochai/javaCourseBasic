package homeworks.homework_34;

import homeworks.homework_32.task_3.PriorityElement;

import java.util.ArrayList;

public class MyCollection {
    private ArrayList<Element> list;


    public MyCollection() {
        this.list = new ArrayList<>();
    }

    //добавляет елемент в конец, в любом случае
    public void addElementInEnd(Element element){
            list.add(element);
    }

    public void addElementByIndex(int index, Element element){
        // Проверяем, что индекс не превышает размер коллекции
        if(index >= 0 && index <= list.size()){
            list.add(index,element);
        }else {
            System.out.println("Невозможно добавить данный елемент в коллекцию, так как запрашиваемый индекс больше чем размер коллекции");
        }
    }

    public void removeElementByIndex(int index){

        if (list.isEmpty()) {
            System.out.println("Невозможно удалить элемент из пустой коллекции");
            return;
        }
        //проверяем что индекс назодится в нужном диапазоне
        // Если он не в диапазоне от 0 до list.size() - 1, выбрасываем исключение IndexOutOfBoundsException. Если обе проверки пройдены успешно, мы удаляем элемент из коллекции.
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + list.size());  //IndexOutOfBoundsException, сообщающее о недопустимом индексе.
        }
       list.remove(index);
    }

    public int sizeOfList(){
        System.out.println("Размер текущей коллекции:");
        return list.size();
    }
    public void printCollection(){
        System.out.println("Все элементы в коллекции: ");
        for (int i = 0; i < list.size(); i++) {
            Element element = list.get(i);
            System.out.println("Элемент с индексом " + i + ": " + element.getNameOfProduct());
        }
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "list=" + list +
                '}';
    }
}
