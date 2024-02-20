package homeworks.extraHomework.addHomework3.task_0_1;

public class Car {
    private String producer;
    private String model;

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public void signal(){
        System.out.println("Машина сигналит!");
    }

    public void start(){
        System.out.println("Машина поехала");
    }
}
