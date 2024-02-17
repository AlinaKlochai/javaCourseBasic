package homeworks.homework_21.incapsulation.task_2;

public class User {
    private String login;
    private String Password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        Password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
