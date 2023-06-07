import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the first word from the user
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        // Accept the second word from the user
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        // Check if the words are anagrams
        boolean areAnagrams = checkAnagram(word1, word2);

        // Print the result
        if (areAnagrams) {
            System.out.println("The words \"" + word1 + "\" and \"" + word2 + "\" are anagrams.");
        } else {
            System.out.println("The words \"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");
        }
    }

    public static boolean checkAnagram(String word1, String word2) {
        // Remove whitespaces and convert to lowercase
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are equal
        if (word1.length() != word2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}