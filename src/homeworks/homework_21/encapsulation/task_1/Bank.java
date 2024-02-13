package homeworks.homework_21.encapsulation.task_1;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        double currentBalance = bankAccount.deposit(1000);
        System.out.println("На данный момент на вашем счету: " + currentBalance + " Euro");
        System.out.println("-------------------------");
        double balanceAfterWithdraw = bankAccount.withdraw(1000);
        System.out.println("На данный момент на вашем счету: " + balanceAfterWithdraw + " Euro");
    }
}
