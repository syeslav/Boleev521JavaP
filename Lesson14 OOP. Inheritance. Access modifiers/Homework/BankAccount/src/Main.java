public class Main {
    //Даты не смог(
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Вывод: [Счёт создан] Начальный баланс: 1000.0 руб.
        account.deposit(500);  // Вывод: [Успешно] Пополнение: +500.0 руб. Текущий баланс: 1500.0 руб.
        account.withdraw(200); // Вывод: [Успешно] Снятие: -200.0 руб. Текущий баланс: 1300.0 руб.
        account.withdraw(2000); // Вывод: [Ошибка] Недостаточно средств или неверная сумма!
    }
}