package DivideJava;
import java.util.Scanner;
public class EasyDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
        } else {
            double result = (double) a / b;
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
