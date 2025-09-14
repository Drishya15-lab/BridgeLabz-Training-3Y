public class Employee {

    // Attributes (non-static variables)
    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: ₹" + salary);
    }

    // Main method to run the program
    public static void main(String[] args) {
        Employee emp = new Employee("Rohan", 101, 500000.00); // Creating object
        emp.displayDetails(); // Calling method to display details
    }
}
