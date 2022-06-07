public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int account = 0;
    private static double totalAmount = 0;

    public BankAccount() {
        account++;
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