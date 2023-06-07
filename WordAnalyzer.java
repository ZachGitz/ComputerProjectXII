import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Analyze each word and display the results
        for (String word : words) {
            int vowelCount = countVowels(word);
            int consonantCount = countConsonants(word);

            System.out.println("Word: " + word);
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
            System.out.println();
        }
    }

    public static int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static int countConsonants(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (isConsonant(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return Character.isLetter(c) && !isVowel(c);
    }
}