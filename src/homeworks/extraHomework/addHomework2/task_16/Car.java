package homeworks.extraHomework.addHomework2.task_16;

/*Найти ошибку в коде.
Исправить и запустить программу.
Менять можно только класс Car.

class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel {
        return this.model
    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}

 */

public class Car {
    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}
