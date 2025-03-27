public class CardAccount extends BankAccount {
    public CardAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        double total = amount * 1.01; // Комиссия 1%
        return super.withdraw(total);
    }
}