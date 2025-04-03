import javax.naming.InsufficientResourcesException;

public class SavingsAccount extends BankAccount{
    private static final double MIN_BALANCE = 1000.0;
    private static final double ANNUAL_INTEREST_RATE = 0.05; // 5% годовых

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, Math.max(initialBalance, MIN_BALANCE));
    }

    @Override
    public void withdraw(double amount) throws InsufficientResourcesException, IllegalAccessException {
        // Проверяем, чтобы после снятия баланс не стал меньше MIN_BALANCE
        if(balance - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Ошибка: Нельзя опустить баланс ниже " + MIN_BALANCE);
        }
    }

    // Метод для начисления ежемесячных процентов
    public void applyMonthlyInterest() throws IllegalAccessException {
        double monthlyInterest = balance * (ANNUAL_INTEREST_RATE / 12);
        deposit(monthlyInterest);
    }
}
