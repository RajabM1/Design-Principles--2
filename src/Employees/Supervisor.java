package Employees;
import java.util.List;

public class Supervisor extends Employee {
        List<Employee> employees;
    public Supervisor(int id, String name, int age, int hourlyRate, int completedHours, List<Employee> employees) {
        super(id, name, age, hourlyRate, completedHours);
        this.employees = employees;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
}
