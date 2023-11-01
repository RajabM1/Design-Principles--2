package Employees;
public class Employee {
    private int id;
    private String name;
    private int age;
    private int hourlyRate;
    private int completedHours;

    public Employee(int id, String name, int age, int hourlyRate, int completedHours) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hourlyRate = hourlyRate;
        this.completedHours = completedHours;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }
    public int getTotalHours() {
        return completedHours;
    }

    public void getData(){
        System.out.println("ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Hourly Rate: $" + hourlyRate + "\n" +
                "Completed Hours: " + completedHours + " hours");
    }
}
