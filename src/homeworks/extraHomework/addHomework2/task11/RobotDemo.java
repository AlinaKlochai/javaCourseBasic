package homeworks.extraHomework.addHomework2.task11;


import homeworks.extraHomework.addHomework2.task11.Robot;

public class RobotDemo {
    public static void main(String[] args) {
        /*

        В классе RobotDemo передайте в конструктор каждого робота его название:

        Robot robot1 = new Robot("Rider"); // пусть этого робота зовут "Rider"
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John"); // а этого робота зовут "John"
        robot2.sayHello();
        robot2.sayYourName();
         */

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        System.out.println("----------Next Robot-------------");

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();


    }
}
