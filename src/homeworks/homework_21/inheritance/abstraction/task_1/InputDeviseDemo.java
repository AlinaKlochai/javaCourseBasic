package homeworks.homework_21.inheritance.abstraction.task_1;

public class InputDeviseDemo {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Volcano","Blade Ultra Thin");
        Mouse mouse = new Mouse("LogiLink","ID0069 Black");

        keyboard.connect();
        keyboard.disconnect();

        mouse.connect();
        mouse.disconnect();
    }
}
