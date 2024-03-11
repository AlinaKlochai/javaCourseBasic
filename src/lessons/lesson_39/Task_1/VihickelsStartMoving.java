package lessons.lesson_39.Task_1;

public class VihickelsStartMoving {
    public static void main(String[] args) {
        StartMoving carStart = new StartMoving() {
            @Override
            public void startMoving() {
                System.out.println("Car is starting");
            }
        };

        StartMoving bicicleStart = new StartMoving() {
            @Override
            public void startMoving() {
                System.out.println("Bicicle is starting");
            }
        };

        carStart.startMoving();
        bicicleStart.startMoving();


    }
}
