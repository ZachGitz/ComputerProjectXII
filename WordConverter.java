import java.util.Scanner;

public class WordConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept word from the user
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        // Convert the word
        String convertedWord = convertWord(word);
        
        // Print the converted word
        System.out.println("Converted word: " + convertedWord);
    }
    
    public static String convertWord(String word) {
        StringBuilder converted = new StringBuilder();
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                boolean isConsonant = true;
                
                for (char vowel : vowels) {
                    if (Character.toLowerCase(c) == vowel) {
                        isConsonant = false;
                        break;
                    }
                }
                
                char convertedChar;
                
                if (isConsonant) {
                    convertedChar = getNearestVowel(c);
                } else {
                    convertedChar = getNearestConsonant(c);
                }
                
                converted.append(convertedChar);
            } else {
                converted.append(c);
            }
        }
        
        return converted.toString();
    }
    
    public static char getNearestVowel(char c) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        int minDistance = Integer.MAX_VALUE;
        char nearestVowel = c;
        
        for (char vowel : vowels) {
            int distance = Math.abs(Character.toLowerCase(c) - vowel);
            if (distance < minDistance) {
                minDistance = distance;
                nearestVowel = vowel;
            }
        }
        
        return Character.isUpperCase(c) ? Character.toUpperCase(nearestVowel) : nearestVowel;
    }
    
    public static char getNearestConsonant(char c) {
        char[] consonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };
        int minDistance = Integer.MAX_VALUE;
        char nearestConsonant = c;
        
        for (char consonant : consonants) {
            int distance = Math.abs(Character.toLowerCase(c) - consonant);
            if (distance < minDistance) {
                minDistance = distance;
                nearestConsonant = consonant;
            }
        }
        
        return Character.isUpperCase(c) ? Character.toUpperCase(nearestConsonant) : nearestConsonant;
    }
}