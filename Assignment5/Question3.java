/*<aside>
💡 **Question 3**
Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

Input: nums = [-4,-1,0,3,10]

Output: [0,1,9,16,100]

**Explanation:** After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]

</aside> */
/*<aside>
💡 **Question 6**
Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

**Example 1:**

Input: nums = [-4,-1,0,3,10]

Output: [0,1,9,16,100]

**Explanation:** After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100]

</aside> */


import java.util.Arrays;

public class Question3 {

    static int[] sortedSquares(int[] A) {

        for (int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }
            Arrays.sort(A);
            return A;
    }

    public static void main(String[] args) {

        int [] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    
}
