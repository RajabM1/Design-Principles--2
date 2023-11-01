import Employees.Director;
import Employees.Employee;
import Employees.Manager;
import Report.CostReport;
import Report.EmployeeReport;
import Report.IReport;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Employee staff1 = new Employee(1, "Ahmad", 40, 1, 200);
        Employee staff2 = new Employee(2, "Khaled", 45, 1, 200);

        Manager Manager1 = new Manager(3, "Anas", 40, 50, 200, List.of(staff1, staff2));
        Manager Manager2 = new Manager(4, "Ammar", 40, 50, 200, List.of(staff1));

        Director director1 = new Director(5, "Mohammad", 45, 60, 180,List.of(Manager1,Manager2, staff2));
        Director director2 = new Director(6, "Bashar", 45, 60, 180,List.of(Manager1));

        FakeDB db = FakeDB.connect();
        db.storedData(staff1);
        db.storedData(director1);
        db.storedData(Manager2);
        db.retrieveData(1).getData();

        EmployeeReport employeeReport = new EmployeeReport(director2);
        employeeReport.report();

        CostReport costReport = new CostReport(director2);
        costReport.report();


    }
}

