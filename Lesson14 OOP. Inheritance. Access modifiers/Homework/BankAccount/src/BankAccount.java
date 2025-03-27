public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("[Счёт создан] Начальный баланс: " + balance + " руб.");
    }

    // Пополнение счёта
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Успешно] Пополнение: +" + amount + " руб. Текущий баланс: " + balance + " руб.");
            return true;
        } else {
            System.out.println("[Ошибка] Сумма пополнения должна быть положительной!");
            return false;
        }
    }

    // Снятие денег
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("[Успешно] Снятие: -" + amount + " руб. Текущий баланс: " + balance + " руб.");
            return true;
        } else {
            System.out.println("[Ошибка] Недостаточно средств или неверная сумма!");
            return false;
        }
    }
}