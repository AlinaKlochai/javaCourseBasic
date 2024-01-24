package homeworks.homework06;

public class UserInputDemo {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        String name = ui.inputName("Введите имя: ");
        System.out.println("Hello " + name + "!");
    }
}
