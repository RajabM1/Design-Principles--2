package Report;
import Employees.Employee;
import Employees.Supervisor;

public class CostReport implements IReport {
    private Supervisor supervisor;
    public CostReport(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
    @Override
    public void report() {
        int budget = 0;
        System.out.println("---- Supervisor ----");
        supervisor.getData();
        System.out.println("\n ---- The required budget ---- \n");
        for(Employee employees : supervisor.getEmployees()){
            budget += employees.getHourlyRate() * employees.getTotalHours();
        }
        System.out.println(budget);
    }
}
