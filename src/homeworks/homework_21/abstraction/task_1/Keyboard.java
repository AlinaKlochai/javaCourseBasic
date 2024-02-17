package homeworks.homework_21.abstraction.task_1;

public class Keyboard extends InputDevise{
    public Keyboard(String producer, String model) {
        super(producer, model);
    }

    @Override
    void connect() {
        System.out.println("Keyboard is connected");
    }

    @Override
    void disconnect() {
        System.out.println("Keyboard is disconnected");

    }
}
