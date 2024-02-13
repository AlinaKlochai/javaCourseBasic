package homeworks.homework_21.inheritance.task_2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculatorArea() {
        return Math.PI * radius * radius;
    }
}
