import java.util.*;

class Course {
    String name;
    List<Student> enrolledStudents = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("Course: " + name);
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Association dono taraf se
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.name);
        }
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        students.add(student); // Aggregation: School has students
    }

    void showStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

public class Schooldemo {
    public static void main(String[] args) {
        School school = new School("Sunrise Public School");

        Student s1 = new Student("Drishya");
        Student s2 = new Student("Aman");

        Course math = new Course("Math");
        Course science = new Course("Science");

        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(math);

        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
        s1.showCourses();
        s2.showCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}