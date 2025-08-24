import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseCm, heightCm;

        System.out.print("Enter base in cm: ");
        baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaInches2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInches2 + " and sq cm is " + areaCm2);
        input.close();
    }
}
