/* <aside>
💡 **Question 5**

Given two integer arrays arr1 and arr2, and the integer d, *return the distance value between the two arrays*.
The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.

**Example 1:**

**Input:** arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2

**Output:** 2

**Explanation:**

For arr1[0]=4 we have:
|4-10|=6 > d=2
|4-9|=5 > d=2
|4-1|=3 > d=2
|4-8|=4 > d=2

For arr1[1]=5 we have:
|5-10|=5 > d=2
|5-9|=4 > d=2
|5-1|=4 > d=2
|5-8|=3 > d=2

For arr1[2]=8 we have:
**|8-10|=2 <= d=2**
**|8-9|=1 <= d=2**
|8-1|=7 > d=2
**|8-8|=0 <= d=2**

</aside> */



import java.util.Arrays;

public class Question5 {

    static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        Arrays.sort(arr2);
        int ans = 0;
        for (int i= 0;i<arr1.length;i++) {
            int it = Arrays.binarySearch(arr2, 0, arr2.length, arr1[i]);
            if (it < 0) it = -(it+1);
            boolean isIt = false;
            if(it<arr2.length && Math.abs(arr2[it] - arr1[i]) <= d)isIt = true;
            if(it != 0 && Math.abs(arr2[it-1] - arr1[i]) <= d)isIt = true;
            if(!isIt)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;

        System.out.println(findTheDistanceValue(arr1, arr2, d));    
    }
}
