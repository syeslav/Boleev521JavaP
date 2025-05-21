import javax.naming.InsufficientResourcesException;

public class Main {
    public static void main(String[] args) throws InsufficientResourcesException, IllegalAccessException {
        // Сберегательный счёт
        SavingsAccount savings = new SavingsAccount("SAV-001", 1500);
        savings.withdraw(1000); // Успешно
        System.out.println("Баланс сберегательного: " + savings.getBalance()); // 500 + защита

        savings.applyMonthlyInterest();
        System.out.println("После процентов: " + savings.getBalance());

        // Расчётный счёт
        CheckingAccount checking = new CheckingAccount("CHK-001", 2000);
        checking.withdraw(1000); // Снимет 1000 + 10 комиссии
        System.out.println("Баланс расчётного: " + checking.getBalance()); // 2000 - 1010 = 990

        checking.withdraw(2000); // Попытка снять: 2000 + 20 = 2020
        System.out.println("Баланс после овердрафта: " + checking.getBalance()); // 990 - 2020 = -1030 (допустимо)
    }
}