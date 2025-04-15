import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();// сотрудники
    private int count;

    public Company(List<Employee> employees, int income) {
        this.employees = employees;
        this.count = income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * •	найм одного сотрудника
     */
    public void hire(Employee employee) {

    }

    /**
     * •	найм списка сотрудников
     */
    public void hireAll(Collection<Employee> employees) {
    }

    /**
     * •	увольнение сотрудника
     */
    public void fire(Employee employee) {

    }

    /**
     * •	получение значения дохода компании
     */
    public double getIncome() {

    }

    /**
     * список по убыванию
     */
    public List<Employee> getTopSalaryStaff(int count){
    }

    /**
     * список по возрастанию
     */
    public List<Employee> getLowestSalaryStaff(int count){
        List<Employee> sorted = new ArrayList<>(employees);

    }


}
