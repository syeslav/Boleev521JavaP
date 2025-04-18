public class TopManager implements Employee {
    private final double fixedSalary;
    private final Company company;

    public TopManager(double fixedSalary, Company company) {
        this.fixedSalary = fixedSalary;
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return company.getIncome() > 10_000_000 ? fixedSalary * 2.5 : fixedSalary;
    }
}
