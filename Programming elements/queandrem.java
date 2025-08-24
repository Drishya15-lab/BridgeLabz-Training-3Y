import java.util.Scanner;
public class queandrem{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
        input.close();
    }
}

