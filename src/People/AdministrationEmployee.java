package People;
public class AdministrationEmployee extends Person {
    private int employeeId;

    public AdministrationEmployee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getId() {
        return employeeId;
    }
}