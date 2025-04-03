public class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -5000.0;
    private static final double WITHDRAWAL_FEE_RATE = 0.01; // 1% комиссии

    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        // Рассчитываем общую сумму к списанию (сумма + комиссия)
        double totalWithdrawal = amount + (amount * WITHDRAWAL_FEE_RATE);

        // Проверяем лимит овердрафта
        if(balance - totalWithdrawal >= OVERDRAFT_LIMIT) {
            balance -= totalWithdrawal;
        } else {
            System.out.println("Ошибка: Превышен лимит овердрафта!");
        }
    }
}
