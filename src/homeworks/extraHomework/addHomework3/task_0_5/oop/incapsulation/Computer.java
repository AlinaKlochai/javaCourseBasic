package homeworks.extraHomework.addHomework3.task_0_5.oop.incapsulation;

public class Computer {
    private String manufacturer;
    private String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
