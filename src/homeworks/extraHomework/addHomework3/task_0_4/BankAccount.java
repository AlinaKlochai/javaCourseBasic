package homeworks.extraHomework.addHomework3.task_0_4;

public class BankAccount {


        String owner;
        int money;

    public BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
            return this.owner;
        }

        double getMoney() {
            return this.money;
        }

}
