import Employees.Employee;
import java.util.HashMap;
import java.util.Map;

public class FakeDB {
    private  Map<Integer, Employee> database;
    private static FakeDB db = null;
    private FakeDB() {
        database = new HashMap<>();
    }
    public static FakeDB connect(){
        if(db == null){
            db = new FakeDB();
        }
        return db;
    }
    public  void storedData(Employee employee){
        database.put(employee.getId(), employee);
    }
    public  Employee retrieveData(int id) {
        return database.get(id);
    }
    public  Map<Integer, Employee> getDatabase() {
        return database;
    }
}
