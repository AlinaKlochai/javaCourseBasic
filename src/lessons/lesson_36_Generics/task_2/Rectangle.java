package lessons.lesson_36_Generics.task_2;

public class Rectangle<T extends Number> implements Figure{
    private T a;
    private T b;

    public Rectangle(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    @Override
    public T area() {
        System.out.println("Площадь прямоугольника");
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }
}
