package homeworks.homework_21.inheritance.task_2;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);
        Triangle triangle1 = new Triangle(7,5);
        double circleArea = circle1.calculatorArea();
        System.out.println("Площадь круга: " + circleArea);
        double triangleArea = triangle1.calculatorArea();
        System.out.println("Площадь треугольника: " + triangleArea);
    }
}
