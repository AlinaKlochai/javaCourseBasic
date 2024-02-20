package homeworks.extraHomework.addHomework3.task_0_4;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        double moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
