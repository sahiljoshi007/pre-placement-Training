/*<aside>
💡 **Question 2**

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.

**Example 1:**

**Input:** n = 5

**Output:** 2

**Explanation:** Because the 3rd row is incomplete, we return 2.

</aside> */


public class Question2 {

    static int arrangeCoins(int n) {
        long start=1;
        long sum=1;
        while( sum <= n){
            sum+= ++start;
        }
        
        return (int) start-1;
    }
    
    public static void main(String[] args) {

        int n = 5;
        System.out.println(arrangeCoins(n));
    }
    
}
