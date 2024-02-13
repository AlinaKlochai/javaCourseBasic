package homeworks.homework_21.inheritance.task_1;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int numberOfDoors) {
        super(model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
