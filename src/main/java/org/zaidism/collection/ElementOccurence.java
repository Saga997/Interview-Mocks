package org.zaidism.collection;

import java.util.HashMap;

public class ElementOccurence {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};

        // HashMap to store the occurrence of each element
        HashMap<Integer, Integer> occurrences = new HashMap<>();

        // Iterate through the array
        for (int num : array) {
            // Check if the element is already in the map
            if (occurrences.containsKey(num)) {
                // Increment the count if it exists
                occurrences.put(num, occurrences.get(num) + 1);
            } else {
                // Add the element with a count of 1 if it doesn't exist
                occurrences.put(num, 1);
            }
        }

        // Display the occurrence of each element
        for (int key : occurrences.keySet()) {
            System.out.println("Element " + key + " occurs " + occurrences.get(key) + " times.");
        }
    }
}
