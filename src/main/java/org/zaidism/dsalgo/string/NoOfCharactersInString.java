package org.zaidism.dsalgo.string;


import java.util.HashMap;
import java.util.Map;

class NoOfCharactersInString {
        public static void main(String[] args) {
            String sentence = "This is my India";

            // Convert the sentence to lowercase and remove spaces
            char[] characters = sentence.toLowerCase().replace(" ", "").toCharArray();

            // Use a Map to store the occurrence of each character
            Map<Character, Integer> occurrenceMap = new HashMap<>();

            // Loop through each character and count occurrences
            for (char c : characters) {
                if (occurrenceMap.containsKey(c)) {
                    occurrenceMap.put(c, occurrenceMap.get(c) + 1);
                } else {
                    occurrenceMap.put(c, 1);
                }
            }

            // Print the characters whose count is 1
            for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println("Character with count 1: " + entry.getKey());
                }
            }
        }
    }


