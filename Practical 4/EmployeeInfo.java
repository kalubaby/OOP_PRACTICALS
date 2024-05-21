import java.util.*;

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, int employeeId, double salary, String specialization) {
        super(name, employeeId, salary);
        this.specialization = specialization;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}


public class EmployeeInfo {
    public static void main(String[] args) {
        Manager manager = new Manager("Nai aryan", 1001, 60000, "Finance");
        Engineer engineer = new Engineer("Ansh meghani", 2001, 70000, "Software Development");

        manager.displayInfo();
        engineer.displayInfo();
    }
}

