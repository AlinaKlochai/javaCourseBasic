package homeworks.extraHomework.addHomework3.task_0_5.oop.incapsulation;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("oop.incapsulation.Computer manufacturer = " + manufacturer);
        System.out.println("oop.incapsulation.Computer model = " + model);
    }
}
