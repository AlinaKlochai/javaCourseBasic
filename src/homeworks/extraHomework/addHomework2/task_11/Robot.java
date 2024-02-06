package homeworks.extraHomework.addHomework2.task_11;

public class Robot {
    public void sayHello(){
        System.out.println("Hello!");
    }

        /*Дайте роботу имя!

            Тема: объявление свойства класса.

            Мы можем создать сколько угодно виртуальных обьектов робот.
            Но все они при вызове метода sayYourName() печатают на
            консоль одно и то же: "My name is ROBO". Давайте это исправим!
            Давайте научим наших роботов запоминать своё уникальное имя
            при создании и потом использовать его при вызове команды
            sayYourName().

            Добавьте в класс Robot свойство name:

            class Robot {

             // в этом свойстве наш виртуальный обьект робот будет
             // запоминать своё имя. Мы используем тип String потому
             // что имя это строка.
             String name;

                ....
    }

         */
        public Robot(){

        }
        public void sayYourName(){
            System.out.println("My name is " + name);
        }

    String name;

    /*
        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

     */

    public Robot(String name) {
        this.name = name;

    }
}
