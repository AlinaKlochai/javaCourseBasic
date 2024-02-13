package homeworks.homework_21.inheritance.task_1;

/*Создайте базовый класс `Vehicle` с общими свойствами и методами для транспортных средств.
Затем создайте производные классы `Car` и `Bicycle`, расширяющие класс `Vehicle`,
добавляя специфические свойства и методы (например, количество дверей для автомобиля).

 */
public class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void voice(String message){
        System.out.println(message);
        System.out.println("Beeeep!");
    }
}
