/* <aside>
💡 **Question 6**

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

**Example 1:**

**Input:** nums = [4,3,2,7,8,2,3,1]

**Output:**

[2,3]

</aside> */


import java.util.*;

public class Question6 {
    static List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> al=new ArrayList<>();
		 HashMap<Integer,Integer> map=new HashMap<>();
		 if(nums.length==1){
			 return al;
		 }
		 for(int i=0;i<nums.length;i++) {
			 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		 }
		 for(int i:map.keySet()) {
			 if(map.get(i)>1) {
				 al.add(i);
			 }
		 }
		 Collections.sort(al);
		 return al;        
    }

    public static void main(String[] args) {

        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
        
    }
}
