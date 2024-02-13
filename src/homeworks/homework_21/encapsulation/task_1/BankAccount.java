package homeworks.homework_21.encapsulation.task_1;

import scanner.UserInput;

/*
Создайте класс `BankAccount`, который инкапсулирует баланс счета. Баланс не должен быть доступен для прямого
изменения извне, а изменяться только с помощью методов `deposit` (для внесения средств) и `withdraw` (для снятия средств).

 */
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double balance){
        UserInput userInput = new UserInput();
        double sumPlus = userInput.inputDouble("Введите ту сумму, которую хотите добавить к счету: ");
       double currentDeposit = balance + sumPlus;
       return currentDeposit;
    }

    public double withdraw(double balance){
        UserInput userInput = new UserInput();
        double sumMinus = userInput.inputDouble("Введите ту сумму, которую хотите снять со счета: ");
        double currentDeposit = balance - sumMinus;
        return currentDeposit;
    }
}
