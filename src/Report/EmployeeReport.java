package Report;
import Employees.Employee;
import Employees.Supervisor;

public class EmployeeReport implements IReport {

    private Supervisor supervisor;
    public EmployeeReport(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
    @Override
    public void report() {
        System.out.println("---- Supervisor ----");
        supervisor.getData();
        System.out.println("\n ---- Employees Report ---- \n");
        for(Employee employees : supervisor.getEmployees()){
            employees.getData();
            System.out.println();
        }
    }
}
