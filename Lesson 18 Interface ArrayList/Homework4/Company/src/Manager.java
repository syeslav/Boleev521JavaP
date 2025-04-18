public class Manager implements Employee {
    private final double fixedSalary;
    private final double earnedForCompany;

    public Manager(double fixedSalary) {
        this.fixedSalary = fixedSalary;
        this.earnedForCompany = generateEarnedForCompany();
    }

    private double generateEarnedForCompany() {
        return 115_000 + Math.random() * 25_000;
    }

    public double getEarnedForCompany() {
        return earnedForCompany;
    }

    @Override
    public double getMonthSalary() {
        return fixedSalary + 0.05 * earnedForCompany;
    }
}