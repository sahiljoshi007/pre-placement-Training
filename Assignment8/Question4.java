/*<aside>
💡 **Question 3**

Given two strings word1 and word2, return *the minimum number of **steps** required to make* word1 *and* word2 *the same*.

In one **step**, you can delete exactly one character in either string.

**Example 1:**

**Input:** word1 = "sea", word2 = "eat"

**Output:** 2

**Explanation:** You need one step to make "sea" to "ea" and another step to make "eat" to "ea".

</aside>  */



public class Question4 {

    static int minDistance(String W1, String W2) {
        int m = W1.length(), n = W2.length();
        if (m < n) {
            String tempStr = W1;
            W1 = W2;
            W2 = tempStr;
            int tempInt = n;
            n = m;
            m = tempInt;
        }
        char[] WA1 = W1.toCharArray(), WA2 = W2.toCharArray();
        int[] dpLast = new int[n+1], dpCurr = new int[n+1];
        for (char c1 : WA1) {
            for (int j = 0; j < n; j++) 
                dpCurr[j+1] = c1 == WA2[j]
                    ? dpLast[j] + 1
                    : Math.max(dpCurr[j], dpLast[j+1]);
            int[] tempArr = dpLast;
            dpLast = dpCurr;
            dpCurr = tempArr;
        }
        return m + n - 2 * dpLast[n];
    }

    public static void main(String[] args) {
        String word1 = "sea", word2 = "eat";
        System.out.println(minDistance(word1, word2));
    }
    
}
