
public class AgeCalculator {

    public static void main(String[] args) {
        
        // Fixed values as variables
        String personName = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        // Result calculation
        int age = currentYear - birthYear;

        // Output
        System.out.println(personName + "'s age in " + currentYear + " is " + age);
    }
}