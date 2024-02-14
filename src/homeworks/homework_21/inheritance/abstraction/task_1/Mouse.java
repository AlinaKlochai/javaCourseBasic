package homeworks.homework_21.inheritance.abstraction.task_1;

public class Mouse extends InputDevise{
    public Mouse(String producer, String model) {
        super(producer, model);
    }

    @Override
    void connect() {
        System.out.println("Mouse is connected");

    }

    @Override
    void disconnect() {
        System.out.println("Mouse is disconnected");
    }
}
