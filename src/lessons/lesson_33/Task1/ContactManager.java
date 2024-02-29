package lessons.lesson_33.Task1;

import java.util.*;

public class ContactManager {
    private Set<Contact> contacts = new HashSet<>();

    public void addContact(Contact contact){
        if (!contacts.contains(contact)){
            contacts.add(contact);
            System.out.println(contact.getName() + contact.getPhoneNumber() + "Добавлен");
        }else{
            System.out.println("Этот контакт не может быть добавлен");
        }
    }

    public void removeContact(Contact contact){
        if (contacts.contains(contact)){
            contacts.remove(contact);
            System.out.println(contact.getName() + contact.getPhoneNumber() + "Удален");
        }else {
            System.out.println(contact.getName() + contact.getPhoneNumber() + " не может быть удален");
        }

    }

    public void getContacts(){
        System.out.println("Все контакты в телефонной книге: ");
        for (Contact contact : contacts){
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public Contact getContactByPhoneNumber(String phoneNumber){
        for (Contact contact : contacts){
            if (contact.getPhoneNumber().equals(phoneNumber)){
                return contact;
            }
        }
        return null;
    }






}
