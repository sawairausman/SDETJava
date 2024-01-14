package class24;

import java.util.HashMap;
import java.util.Map;

public class CountEachLetter {

        public static void main(String[] args) {

            String var = "Selenium";
            Map<Character, Integer> letterCountMap = countLetters(var);

            // Display the letter counts
            for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
                System.out.println("Letter: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }

        private static Map<Character, Integer> countLetters(String str) {
            Map<Character, Integer> letterCountMap = new HashMap<>();

            // Convert the string to lowercase to make it case-insensitive
            str = str.toLowerCase();

            // Iterate through each character in the string
            for (char c : str.toCharArray()) {
                // Check if the character is a letter
                if (Character.isLetter(c)) {
                    // Update the count in the map
                    letterCountMap.put(c, letterCountMap.getOrDefault(c, 0) + 1);
                }
            }

            return letterCountMap;
        }
    }


