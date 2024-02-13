package homeworks.homework_21.inheritance.task_1;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car1 = new Car("Mersedes", 4);
        Bycicle bycicle1 = new Bycicle("MTB 250", 2);

        car1.voice("Мвшина сигналит!");
        bycicle1.voice("Велосипед сигналит!");
    }
}
