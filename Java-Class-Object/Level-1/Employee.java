// File: Employee.java
public class Employee {
    // Fields (private for encapsulation)
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize all attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter and Setter methods (optional but shown for best practices)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: Rs. " + salary);
    }

    // Main method to test
    public static void main(String[] args) {
        Employee emp = new Employee("Amit Sharma", 101, 50000.0);
        emp.displayDetails();
    }
}
