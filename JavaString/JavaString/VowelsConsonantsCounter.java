package JavaString.JavaString;
import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check character type: Vowel, Consonant, or Not a Letter
    public static String checkCharType(char ch) {
        // Agar uppercase hai toh lowercase mein convert karo using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // 'A' = 65, 'a' = 97
        }

        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            // Vowel check
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to count vowels and consonants using charAt()
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0;; i++) {
            try {
                char ch = str.charAt(i);
                String type = checkCharType(ch);

                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }
            } catch (Exception e) {
                // Jab charAt() fail kare, matlab string khatam ho gayi
                break;
            }
        }

        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("Total Vowels: " + result[0]);
        System.out.println("Total Consonants: " + result[1]);
    }
}