import java.util.ArrayList;
import java.util.List;

class Employee {
    // Encapsulated Fields
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: Rs." + salary);
    }
}

public class EmployeeMain {
	
/**Design a simple Java class Employee with the following attributes:
id (integer)
name (string)
salary (double)
Create a method displayDetails() to print employee details.
Write a main method to:
1. Create at least 3 Employee objects.
2. Store them in a list.
3. Display their details.*/

    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Amanat Kumar Das", 85000);
        Employee emp2 = new Employee(102, "Leela Devi", 78000);
        Employee emp3 = new Employee(103, "Rakal Banerjee", 92000);

        // Storing in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Displaying details of all employees
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
