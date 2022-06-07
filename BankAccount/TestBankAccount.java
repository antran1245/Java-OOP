public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();

        System.out.printf("Account Number: %s\n", user1.getAccountNumber());
        user1.deposit("checkingBalance", 50);
        user1.deposit("savingBalance", 23.50);
        user1.displayTotal();

        System.out.printf("Account Number: %s\n", user2.getAccountNumber());
        user2.displayTotal();
        user2.withdraw("checkingBalance", 10);
        user2.displayTotal();
    }
}