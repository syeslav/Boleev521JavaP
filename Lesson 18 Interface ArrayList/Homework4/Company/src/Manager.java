import java.util.Random;

/* зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег.
    Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей. */

public class Manager extends Employee {
    final double BONUS = 0.05;
    final int profit = new Random().nextInt(25000) + 115000;
    private int salaryManager;
    private int salaryBonus;

    public Manager(int salaryManager, int salaryBonus) {
        this.salaryManager = salaryManager;
        this.salaryBonus = salaryBonus;
    }

    public int getProfit() {
        return profit;
    }

    public int getSalaryBonus() {
        this.salaryBonus += (int) (profit * BONUS);
        return salaryBonus;
    }

    public int getSalaryManager() {
        return salaryManager;
    }

    @Override
    public void getMonthSalary() {
        this.salaryManager += (int) (this.salaryManager + this.salaryBonus);
    }
}
