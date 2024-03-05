package lessons.lesson_36_Generics.task_2;

public class Circle<T extends Number> implements Figure{

     private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    @Override
    public Object area() {
        System.out.println("Площадь круга");
        return Math.PI * radius.doubleValue() * radius.doubleValue();
    }
}
