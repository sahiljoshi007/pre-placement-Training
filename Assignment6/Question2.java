/* <aside>
💡 **Question 2**

You are given an m x n integer matrix matrix with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true *if* target *is in* matrix *or* false *otherwise*.

You must write a solution in O(log(m * n)) time complexity.

**Example 1:**

**Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3

**Output:** true

</aside> */


public class Question2 {
    
    static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

    // binnary implementation
        int low=0,high=m*n-1;
        while(low<=high) {
            int midIdx,midEle,rowIdx,colIdx;
            
            midIdx=low+(high-low)/2;
            rowIdx=midIdx/n;
            colIdx=midIdx%n;
            midEle=matrix[rowIdx][colIdx];
            if(midEle==target)
            return true;
            else if(midEle<target)
            low=midIdx+1;
            else 
            high=midIdx-1;
        }
        return false;    
    }

    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,},{10,11,16,2},{23,30,34,60}};
        int target = 3;

        System.out.println(searchMatrix(matrix, target));
        
    }
}