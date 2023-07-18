/* <aside>
💡 **Question 6**

An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].

</aside> */


import java.util.*;

public class Question6 {

    static int[] findOriginalArray(int[] changed) {
        int[] temp = new int[changed.length/2];
        Queue<Integer> x = new LinkedList<>();
        Arrays.sort(changed);
        int i = 0;
        for(int num : changed){
            if(!x.isEmpty() && x.peek()==num)
                temp[i++] = x.poll()/2;
            else x.add(num*2);
        }
        return x.size()>0 ? new int[]{}:temp;
    }

    public static void main(String[] args) {

        int [] changed = {1,3,4,2,6,8};
        System.out.println(Arrays.toString(findOriginalArray(changed)));
    }
}
