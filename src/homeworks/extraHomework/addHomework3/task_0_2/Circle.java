package homeworks.extraHomework.addHomework3.task_0_2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public  void calculateArea(){
         double calculateArea = radius * radius;
        System.out.println("Площадь круга = " + calculateArea);
    }
}
