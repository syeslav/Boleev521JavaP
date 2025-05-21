import java.util.*;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        hireEmployees(company);

        System.out.println("Доход компании: " + company.getIncome() + " руб.");

    }

    private static void hireEmployees(Company company) {
        for (int i = 0; i < 180; i++) {
            company.hire(new Operator(30_000));
        }
        for (int i = 0; i < 80; i++) {
            company.hire(new Manager(40_000));
        }
        for (int i = 0; i < 10; i++) {
            company.hire(new TopManager(50_000, company));
        }
    }


    private static void printSalaries(List<Employee> employees) {
        System.out.printf("%.2f руб.\n");
    }
}
