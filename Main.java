import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    //Main function
    public static void main(String[] args) {
        String[] lines = {
                "мама",
                "папа",
                "їж їжак желе"
        };

        System.out.print("Input parameter is an array of such strings: ");
        printAllLines(lines);
        System.out.println();

        System.out.println("First two words with two matching letters are: ");
        getFirstTwoWordsWithSameLetters(lines);
        System.out.println();

        System.out.println("Unique letters in all words are: ");
        Set<Character> uniqueLetters = getUniqueLetters(lines);
        for (char c : uniqueLetters) {
            System.out.print(c + " ");
        }
    }

    public static void printAllLines(String[] lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    //Function to get first two words with same letters
    public static void getFirstTwoWordsWithSameLetters(String[] lines) {
        int count = 0;
        Set<Character> uniqueCharacters = new HashSet<>();

        for (String line : lines) {
            Map<Character, Integer> charCountMap = new HashMap<>();
            for (char c : line.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            for (int charCount : charCountMap.values()) {
                if (charCount % 2 != 0) {
                    break;
                }
            }

            count++;
            System.out.println(line);

            char[] chars = line.toCharArray();
            if (count == 2) {
                for (int i = 0; i < chars.length; i++) {
                    uniqueCharacters.add(chars[i]);
                }
                System.out.println();
                break;
            } else {
                for (int i = 0; i < chars.length; i++) {
                    uniqueCharacters.add(chars[i]);
                }
            }
        }

        System.out.println("Unique characters in the found words:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
    }

    //Function to get unique letters
    public static Set<Character> getUniqueLetters(String[] lines) {
        Set<Character> uniqueLetters = new HashSet<>();

        for (String line : lines) {
            char[] chars = line.toCharArray();
            for (char c : chars) {
                uniqueLetters.add(c);
            }
        }
        return uniqueLetters;
    }
}
