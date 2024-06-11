import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count the occurrences of each number in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int[] result = new int[arr1.length];
        int index = 0;
        
        // Place elements from arr2 in the result array
        for (int num : arr2) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                while (count > 0) {
                    result[index++] = num;
                    count--;
                }
                map.remove(num);  // Remove the element from the map once processed
            }
        }
        
        // Collect remaining elements not in arr2
        List<Integer> remainingElements = new ArrayList<>();
        for (int num : arr1) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                while (count > 0) {
                    remainingElements.add(num);
                    count--;
                }
                map.remove(num);  // Remove the element from the map once processed
            }
        }
        
        // Sort the remaining elements
        Collections.sort(remainingElements);
        
        // Add remaining elements to the result array
        for (int num : remainingElements) {
            result[index++] = num;
        }
        
        return result;
    }
}
