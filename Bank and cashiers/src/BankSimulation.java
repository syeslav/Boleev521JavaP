import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Bank {
    private int balance = 0;
    private final int MAX_BALANCE = 1000;
    private final int MIN_BALANCE = 0;
    private int operationCount = 0;

    public synchronized void deposit(int amount, String threadName) throws InterruptedException {
        while (balance + amount > MAX_BALANCE) {
            System.out.println(threadName + ": касса переполнена, ожидаю...");
            wait();
        }

        balance += amount;
        operationCount++;
        System.out.println(threadName + " (пополнение): внес " + amount + ". Баланс: " + balance);

        if (operationCount % 10 == 0) {
            System.out.println("--- Статус: баланс " + balance + ", операций: " + operationCount + " ---");
        }

        notifyAll();
    }

    public synchronized void withdraw(int amount, String threadName) throws InterruptedException {
        while (balance < amount) {
            System.out.println(threadName + ": недостаточно средств, ожидаю...");
            wait();
        }

        balance -= amount;
        operationCount++;
        System.out.println(threadName + " (выдача): выдал " + amount + ". Баланс: " + balance);

        if (operationCount % 10 == 0) {
            System.out.println("--- Статус: баланс " + balance + ", операций: " + operationCount + " ---");
        }

        notifyAll();
    }
}

class Cashier implements Runnable {
    private final Bank bank;
    private final List<Integer> operations;
    private final boolean isDeposit;
    private final String threadName;

    public Cashier(Bank bank, List<Integer> operations, boolean isDeposit, String threadName) {
        this.bank = bank;
        this.operations = operations;
        this.isDeposit = isDeposit;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for (int amount : operations) {
                if (isDeposit) {
                    bank.deposit(amount, threadName);
                } else {
                    bank.withdraw(amount, threadName);
                }
                Thread.sleep(100); // Имитация обработки
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        List<Thread> threads = new ArrayList<>();

        // Создаем кассиров
        List<Cashier> cashiers = Arrays.asList(
                new Cashier(bank, Arrays.asList(100, 200, 150), true, "Кассир 1"),
                new Cashier(bank, Arrays.asList(50, 300, 120), true, "Кассир 2"),
                new Cashier(bank, Arrays.asList(150, 200, 50), false, "Кассир 3"),
                new Cashier(bank, Arrays.asList(100, 200, 300), false, "Кассир 4"),
                new Cashier(bank, Arrays.asList(200, 150, 100), false, "Кассир 5")
        );

        // Запускаем потоки
        for (int i = 0; i < cashiers.size(); i++) {
            Thread thread = new Thread(cashiers.get(i));
            thread.start();
            threads.add(thread);
        }

        // Ожидаем завершения
        for (Thread thread : threads) {
            thread.join();
        }
    }
}