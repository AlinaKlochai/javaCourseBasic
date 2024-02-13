package homeworks.homework_21.inheritance.task_1;

public class Bycicle extends Vehicle{
    int numbersOfWheels;

    public Bycicle(String model, int numbersOfWheels) {
        super(model);
        this.numbersOfWheels = numbersOfWheels;
    }

    public int getNumbersOfWheels() {
        return numbersOfWheels;
    }
}
