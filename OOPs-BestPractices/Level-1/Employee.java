
public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "IT", 60000);
        emp.displayEmployeeDetails();

        System.out.println();

        emp.setSalary(65000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}

// Subclass to demonstrate access to employeeID and department
class Manager extends Employee {
    private String managerLevel;

    public Manager(int employeeID, String department, double salary, String managerLevel) {
        super(employeeID, department, salary);
        this.managerLevel = managerLevel;
    }

    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department (protected): " + department);
        System.out.println("Manager Level: " + managerLevel);
    }

    public static void main(String[] args) {
        Manager mgr = new Manager(201, "HR", 90000, "Senior");
        mgr.displayManagerDetails();
    }
}
