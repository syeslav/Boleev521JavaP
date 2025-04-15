/* зарплата складывается только из фиксированной части. */

public class Operator extends Employee {
    private int salaryOperator;

    public Operator(int salaryOperator) {
        this.salaryOperator = salaryOperator;
    }

    @Override
    public void getMonthSalary() {

    }
}
