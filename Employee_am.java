import java.util.Scanner;

// Employee class to hold employee details
class Employee {
    // Instance variables (attributes)
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    // Setter methods to set the values of instance variables
    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods to retrieve the values of instance variables
    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public double getSalary() {
        return this.salary;
    }

    // Method to calculate net salary based on PF percentage
    public void calculateNetSalary(int pfPercentage) {
        double pfAmount = (salary * pfPercentage) / 100;
        this.netSalary = salary - pfAmount;  // Deduct PF from salary to get net salary
    }

    // Getter method to retrieve net salary
    public double getNetSalary() {
        return this.netSalary;
    }
}

public class Employee_am {
    public static Employee getEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        double salary = 0;
        
        // Taking user input for employee details
        System.out.println("Enter Id:");
        id = scanner.nextInt();
        
        System.out.println("Enter Name:");
        name = scanner.next();
        
        // Error handling for salary input
        while (true) {
            try {
                System.out.println("Enter salary:");
                salary = scanner.nextDouble();
                break;  // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input for salary! Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
        }
        
        // Creating a new Employee object and setting its attributes
        Employee employee = new Employee();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setSalary(salary);
        
        return employee;
    }
    
    public static int getPFPercentage() {
        Scanner scanner = new Scanner(System.in);
        int pfPercentage = 0;
        
        // Error handling for PF percentage input
        while (true) {
            try {
                System.out.println("Enter PF percentage:");
                pfPercentage = scanner.nextInt();
                break;  // Exit the loop if input is valid
            } catch (Exception e) {
                System.out.println("Invalid input for PF percentage! Please enter a valid number.");
                scanner.next();  // Clear the invalid input
            }
        }
        
        return pfPercentage;
    }
    
    public static void main(String[] args) {
        // Driver program to test Employee class methods
        Employee employee = getEmployeeDetails();
        int pfPercentage = getPFPercentage();
        
        // Calculate net salary based on PF percentage
        employee.calculateNetSalary(pfPercentage);
        
        // Display employee details and net salary
        System.out.println("Id: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Net Salary: " + employee.getNetSalary());
    }
}
