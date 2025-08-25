package JavaString.JavaString;

import java.util.Scanner;

public class NumberFormatDemo {
    static void generateException(String text) {
        int number = Integer.parseInt(text); // Will fail if text is not a number
        System.out.println("Parsed number: " + number);
    }

    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (or text): ");
        String input = sc.next();

        // generateException(input); // Uncomment to crash
        handleException(input);
    }
}