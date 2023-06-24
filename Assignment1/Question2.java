

public class Question2 {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val, update the nums array
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        Question2 solution = new Question2();
        int k = solution.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
