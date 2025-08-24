import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        // Step 2: Initialize array and variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Step 3: Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Step 4: Resize array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }

                // Step 5: Store factor
                factors[index] = i;
                index++;
            }
        }

        // Step 6: Display factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
