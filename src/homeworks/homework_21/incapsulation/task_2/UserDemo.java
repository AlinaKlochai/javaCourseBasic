package homeworks.homework_21.incapsulation.task_2;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("user007","User!007","user007.tuta.io");
        UserServise servise = new UserServise();
        String passwordFromUser = servise.inputPassword();

        System.out.println("Проверка---");
        servise.checkOldPassword(passwordFromUser,user.getPassword());

        System.out.println("Установка нового пароля--- ");
        System.out.println("Введите повторно пароль для проверки: ");

       servise.setNewPassword();

       String newPassword = user.getPassword();
        System.out.println(newPassword);

    }
}
