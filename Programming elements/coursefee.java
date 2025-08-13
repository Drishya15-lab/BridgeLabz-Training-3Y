import java.util.Scanner;

public class coursefee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fee, discountPercent;

        System.out.print("Enter the course fee (INR): ");
        fee = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        discountPercent = sc.nextDouble();

        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    sc.close();
    }
}