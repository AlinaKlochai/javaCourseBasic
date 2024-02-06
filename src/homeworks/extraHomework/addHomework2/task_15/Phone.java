package homeworks.extraHomework.addHomework2.task_15;


/*Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Phone.

class Phone {

    String model;{

    Book(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}

 */
public class Phone {
    String model;

    public Phone(String model) {
        this.model = model;
    }

    String getModel() {
            return this.model;
        }

    }
