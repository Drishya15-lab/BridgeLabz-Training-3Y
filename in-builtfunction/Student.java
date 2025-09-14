

public class Student {
    static String universityName = "Delhi University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Aarav Mehta", "A");
        Student s2 = new Student(102, "Isha Verma", "B+");

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
        System.out.println();
        Student.displayTotalStudents();
    }
}