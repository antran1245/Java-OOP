import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int account = 0;
    private static double totalAmount = 0;
    private String accountNumber = "";

    public BankAccount() {
        createAccountNumber();
        account++;
    }

    private void createAccountNumber() {
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            accountNumber += rand.nextInt(10);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void deposit(String accountBalance, double money) {
        if (accountBalance == "checkingBalance") {
            checkingBalance += money;
        } else {
            savingBalance += money;
        }
        totalAmount = savingBalance + checkingBalance;
    }

    public double withdraw(String accountBalance, double money) {
        if (accountBalance == "checkingBalance") {
            if(checkingBalance - money >= 0) {
                checkingBalance -= money;
                totalAmount -= money;
                return money;
            }
        } else {
            if(savingBalance - money >= 0) {
                savingBalance -= money;
                totalAmount -= money;
                return money;
            }
        }
        return 0;
    }

    public void displayTotal() {
        System.out.printf("Total Balance: $%.2f\n", totalAmount);
    }

    public int getNumberOfAccount() {
        return account;
    }
}