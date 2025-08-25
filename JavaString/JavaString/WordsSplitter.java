package JavaString.JavaString;

import java.util.Scanner;

public class WordsSplitter {
    public static String[] customSplit(String text) {
        int count = 1;
        for (int i = 0;; i++) {
            try {
                if (text.charAt(i) == ' ') count++;
            } catch (Exception e) {
                break;
            }
        }

        int[] spaceIndexes = new int[count - 1];
        int idx = 0;
        for (int i = 0;; i++) {
            try {
                if (text.charAt(i) == ' ') {
                    spaceIndexes[idx++] = i;
                }
            } catch (Exception e) {
                break;
            }
        }

        String[] words = new String[count];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[count - 1] = text.substring(start);
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");

        System.out.println("Custom Split:");
        for (String word : customWords) System.out.println(word);

        System.out.println("Built-in Split:");
        for (String word : builtInWords) System.out.println(word);

        System.out.println("Are both arrays equal? " + compareArrays(customWords, builtInWords));
    }
}