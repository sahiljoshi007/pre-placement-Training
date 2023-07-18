/* <aside>
💡 **Question 5**

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

**Example 1:**

**Input:** s = "abcdefg", k = 2

**Output:**

"bacdfeg"

</aside> */


public class Question5 {
    static String reverseStr(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i += 2*k) {
            // Creating the separator for every iteration.
            int j = Math.min(i + k, n);
            // Substring to reverse first k elements
            StringBuilder rev = new StringBuilder(s.substring(i, j));
            rev.reverse();
            sb.append(rev);
            // Substring to append the rest elements.
            int rem = Math.min(i + 2*k, n);
            sb.append(s.substring(j, rem));
        }
        // Converting back the StringBuilder to String
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        System.out.println(reverseStr(s, k));
        
    }
}