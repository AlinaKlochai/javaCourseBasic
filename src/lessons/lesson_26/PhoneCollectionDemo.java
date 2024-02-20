package lessons.lesson_26;

import java.util.ArrayList;

public class PhoneCollectionDemo {
    public static void main(String[] args) {
        ArrayList <Phone> phones = new ArrayList<>();
        System.out.println("Созданная коллекция:");
        System.out.println(phones);
        Phone phone1 = new Phone(1, "Galaxy 21","Samsung",800.5);

        phones.add(phone1);

        System.out.println("Добавлен елемент");

        System.out.println(phones);
        Phone phone2 = new Phone(2, "Galaxy 20","Samsung",800.5);
        Phone phone3 = new Phone(3, "Galaxy 22","Samsung",700.5);
        Phone phone4 = new Phone(4, "13 Pro Max","IPhone",1000.5);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);

        System.out.println("Все елементы");
        System.out.println(phones);

        phones.remove(0);
        System.out.println("Удален один из элементов по индексу");
        System.out.println(phones);

        phones.remove(phone2);
        System.out.println("Удален один из элементов по объекту");
        System.out.println(phones);

    }
}
