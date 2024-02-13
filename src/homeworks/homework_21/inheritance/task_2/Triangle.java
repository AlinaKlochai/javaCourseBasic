package homeworks.homework_21.inheritance.task_2;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculatorArea() {
        return 0.5 * base * height;
    }
}
