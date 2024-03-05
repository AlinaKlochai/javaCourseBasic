package lessons.lesson_36_Generics.task_2;

public class FigureDemo {
    public static void main(String[] args) {
        Circle<Double> circle1 = new Circle<>(5.4);
        System.out.println(circle1.area());

        Rectangle<Integer> rectangle1 = new Rectangle<>(2,3);
        System.out.println(rectangle1.area());

        System.out.println("----float---");
        Circle<Float> circle2 = new Circle<>(5f);
        System.out.println(circle2.area());

    }
}
