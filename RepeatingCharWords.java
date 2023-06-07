import java.util.Scanner;

public class RepeatingCharWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Words with repeating characters:");

        for (String word : words) {
            if (hasRepeatingChars(word)) {
                System.out.println(word);
            }
        }
    }

    // Function to check if a word has repeating characters
    public static boolean hasRepeatingChars(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            char currentChar = Character.toLowerCase(word.charAt(i));
            for (int j = i + 1; j < word.length(); j++) {
                if (Character.toLowerCase(word.charAt(j)) == currentChar) {
                    return true;
                }
            }
        }
        return false;
    }
}