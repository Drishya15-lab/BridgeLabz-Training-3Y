import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    void showDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showCompanyStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.showDept();
        }
    }
}

public class Company {
    public static void main(String[] args) {
        Company techCorp = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee("Aman");
        dev.addEmployee("Riya");

        Department hr = new Department("HR");
        hr.addEmployee("Neha");

        techCorp.addDepartment(dev);
        techCorp.addDepartment(hr);

        techCorp.showCompanyStructure();

        // Jab Company delete hoti hai, departments aur employees bhi chale jaate hain
        techCorp = null;
        System.gc(); // Suggest garbage collection
        System.out.println("Company deleted, departments and employees gone.");
    }
}