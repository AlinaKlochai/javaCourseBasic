package lessons.lesson_33.Task1;

public class NumbersBook {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Contact contact1 = new Contact("Tomas","3467892648");
        Contact contact2 = new Contact("Dona","678926484674");
        Contact contact3 = new Contact("Tom","34678926948");
        Contact contact4 = new Contact("Nick","3467892648");
        Contact contact5 = new Contact("Tomas","3467892648");

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);
        contactManager.addContact(contact4);
        contactManager.addContact(contact5);

        System.out.println("---------------------");
        contactManager.getContacts();

        System.out.println("---------------------");
        contactManager.removeContact(contact1);

        contactManager.getContacts();

        System.out.println("---------------------");
        System.out.println("Найден введенный контакт");
        System.out.println(contactManager.getContactByName("Nick"));
    }
}
