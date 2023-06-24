import java.util.HashMap;

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each number and its index
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in the map, return its index and the current index
            if (complementMap.containsKey(complement)) {
                return new int[] { complementMap.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the map
            complementMap.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        Question1 solution = new Question1();
        int[] indices = solution.twoSum(nums, target);

        System.out.println("[" + indices[0] + ", " + indices[1] + "]");
    }
}