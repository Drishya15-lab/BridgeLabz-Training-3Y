import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Step 2: Create 2D array
        int[][] matrix = new int[rows][cols];

        // Step 3: Take input for each element
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 4: Create 1D array of size rows * cols
        int[] array = new int[rows * cols];
        int index = 0;

        // Step 5: Copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Step 6: Display 1D array
        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Position " + i + " = " + array[i]);
        }
    }
}
