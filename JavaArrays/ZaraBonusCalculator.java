import java.util.Scanner;

public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Define arrays for salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Step 2: Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Step 3: Input loop for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            // Validate input
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // Retry this employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // Step 4: Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Step 5: Display results
        System.out.println("\n--- Bonus Report for Zara ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = ₹%.2f, Bonus = ₹%.2f, New Salary = ₹%.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout: ₹" + String.format("%.2f", totalBonus));
        System.out.println("Total Old Salary: ₹" + String.format("%.2f", totalOldSalary));
        System.out.println("Total New Salary: ₹" + String.format("%.2f", totalNewSalary));
    }
}
