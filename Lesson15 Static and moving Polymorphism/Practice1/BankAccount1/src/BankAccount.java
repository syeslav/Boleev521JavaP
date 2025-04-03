import javax.naming.InsufficientResourcesException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private final String accountNumber;       //номер счета
    private String accountHolderName;   //имя владельца
    public double balance;             //текущий баланс
    private LocalDate openingDate;      //дата открытия счёта
    private List<Transaction> Transaction = new ArrayList<>();

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //пополняет счет на указанную сумму
    public void deposit(double amount) throws IllegalAccessException {
        if (amount <= 0) {
            throw new IllegalAccessException("Сумма должна быть положительной!");
        }
        balance += amount;
    }

    //снимает деньги со счета
    public void withdraw(double amount) throws InsufficientResourcesException, IllegalAccessException {
        if (amount <= 0) {
            throw new IllegalAccessException("Сумма должна быть положительной!");
        }
        if (amount > balance) {
            throw new InsufficientResourcesException("\"Недостаточно средств на счету!\"");
        }
        balance -= amount;
    }

    //выводит информацию о счёте
    public void getAccountDetails() {
        System.out.println("Номер: " + accountNumber + " Владелец: " + accountHolderName + " Дата открытия: " + openingDate + " Баланс: " + balance);
    }

    //выводит текущий баланс
    public void checkBalance() {
        System.out.println(this.balance);
    }

    public void applyMonthlyInterest() throws IllegalAccessException {

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransaction() {
        return Transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        Transaction = transaction;
    }
}
