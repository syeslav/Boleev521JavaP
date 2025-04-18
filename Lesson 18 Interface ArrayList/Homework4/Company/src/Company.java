import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();// сотрудники

    /**
     * •	найм одного сотрудника
     */
    public void hire(Employee employee) {
        employees.add(employee);
    }

    /**
     * •	найм списка сотрудников
     */
    public void hireAll(Collection<Employee> employees) {
        employees.addAll(employees);
    }

    /**
     * •	увольнение сотрудника
     */
    public void fire(Employee employee) {
        employees.remove(employee);
    }

    /**
     * •	получение значения дохода компании
     */
    public double getIncome() {
        double income = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                income += manager.getEarnedForCompany();
            }
        }
        return income;
    }
}
