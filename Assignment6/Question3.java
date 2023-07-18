/* <aside>
💡 **Question 3**

Given an array of integers arr, return *true if and only if it is a valid mountain array*.

Recall that arr is a mountain array if and only if:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
    - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

**Example 1:**

**Input:** arr = [2,1]

**Output:**
false

</aside> */



public class Question3 {

    static boolean validMountainArray(int[] arr) {
        //if size is < 2 then it not mountain
        if(arr.length<3) return false;
        int topidx=0;
        int top=0;
        //find max value and that index
        for(int i=0;i<arr.length;i++){
            if(arr[i]>top){
                top = arr[i];
                topidx=i;
            }
        }
        //check that one side mountain or not .   
        if(top==arr[arr.length-1] || top==arr[0]) return false;
        //check perfact mountain or not
        int i=0;
        while(i<topidx)
        {
            if(arr[i] >= arr[i+1]) return false;
            i++;
        }
        while(topidx<arr.length-1){
            if(arr[topidx] <= arr[topidx+1]) return false;
            topidx++;
        }
        return true;
    }

    public static void main(String[] args) {
        int []  arr = {0,3,2,1};

        System.out.println(validMountainArray(arr));
    }
}
