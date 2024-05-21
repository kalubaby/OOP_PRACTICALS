import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    
    // Method to get data (name and salary) from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        this.salary = scanner.nextDouble();
    }
    
    // Method to display data (name and salary) for the employee
    public void putData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class pract3_4 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee();
        
        // Get data from the user
        employee.getData();
        
        // Display data
        employee.putData();
    }
}
