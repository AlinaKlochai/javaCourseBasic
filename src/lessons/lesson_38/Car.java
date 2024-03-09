package lessons.lesson_38;

public class Car {
    private String model;
    private int countOfDoors;

    public Car(String model, int countOfDoors) {
        this.model = model;
        this.countOfDoors = countOfDoors;
    }


    public class Door{
        private double length;
        private double height;

        public Door(double length, double height) {
            this.length = length;
            this.height = height;
        }

        public double getLength() {
            return length;
        }

        public double getHeight() {
            return height;
        }

        public void isOpen(){
            System.out.println("Дверь открывается");
        }
        public void isClose(){
            System.out.println("Дверь закрывается");
        }
    }
}
