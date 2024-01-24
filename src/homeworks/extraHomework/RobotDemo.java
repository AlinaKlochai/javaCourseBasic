package homeworks.extraHomework;

public class RobotDemo {

    //Внутри класса RobotDemo создайте метод
    public static void main(String[] args) {

        //создайте экземпляр класса Robot вызвав конструктор класса

        Robot robot1 = new Robot();
        //В методе main(...) класса RobotDemo вызовите метод sayHello() у созданного ранее виртуального обьекта.
        robot1.sayHello();

        //В методе main(...) класса RobotDemo вызовите метод sayYourName() у созданного ранее обьекта.

        Robot robot2 = new Robot();
        robot2.sayYourName();

        Robot robot3 = new Robot();
        robot3.sayYourName3();

    }
}
