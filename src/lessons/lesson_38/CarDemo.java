package lessons.lesson_38;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW",4);
        Car.Door door1 = car1.new Door(500.5,800);
        door1.isOpen();
        door1.isClose();
    }
}
