import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Department: " + name);
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showStructure() {
        System.out.println("University: " + name);
        for (Department d : departments) {
            d.show();
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        Department cs = new Department("Computer Science");
        Department eco = new Department("Economics");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Mehta");

        uni.addDepartment(cs);
        uni.addDepartment(eco);

        uni.showStructure();
        f1.show(); // Aggregation: Faculty independent
        f2.show();

        // Composition: jab University delete hoti hai, departments bhi chale jaate hain
        uni = null;
        System.gc();
        System.out.println("University deleted. Departments gone.");
    }
}