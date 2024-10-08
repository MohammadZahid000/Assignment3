package Assignment3;

import java.util.HashMap;

public class ElementCount {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 5, 3, 6, 3}; 

        HashMap<Integer, Integer> countMap = countOccurrences(array);

        System.out.println("Element Counts:");
        for (HashMap.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    
    public static HashMap<Integer, Integer> countOccurrences(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return countMap;
    }
}
