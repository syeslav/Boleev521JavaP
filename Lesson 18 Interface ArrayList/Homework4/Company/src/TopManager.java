/* зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы, если доход компании более 10 млн рублей. */

public class TopManager extends Employee {
    final double BONUS = 1.5;
    final int INITIAL_BALANCE = 10_000_000;
    private int salaryTopManager;

    public TopManager(int salaryTopManager) {
        this.salaryTopManager = salaryTopManager;
    }

    @Override
    public void getMonthSalary() {

    }
}
