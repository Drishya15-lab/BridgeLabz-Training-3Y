import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter a positive number: ");
        long number = sc.nextLong();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        // Step 2: Frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Step 3: Extract digits and update frequency
        long temp = number;
        while (temp > 0) {
            int digit = (int)(temp % 10); // Get last digit
            frequency[digit]++;           // Increment frequency
            temp /= 10;                   // Remove last digit
        }

        // Step 4: Display frequency of each digit
        System.out.println("\nDigit Frequency in " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " = " + frequency[i] + " time(s)");
            }
        }
    }
}
