package Employees;
import java.util.List;

public class Director extends Supervisor {
    public Director(int id, String name, int age, int hourlyRate, int completedHours, List<Employee> employees) {
        super(id, name, age, hourlyRate, completedHours, employees);
    }
}
