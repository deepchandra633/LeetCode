import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
       HashSet<Integer>hs=new HashSet <>();
       int n=nums.length;
       for(int i : nums){
        hs.add(i);
       }

       int arr []=new int[hs.size()];
       int index=0;
       for(int i : hs){
        arr[index]=i;
        index++;
       }
       Arrays.sort(arr);
       if(arr.length<3){
        return arr[arr.length-1];
       }

       return arr[arr.length-3];


    // Long max1 = null, max2 = null, max3 = null;
        
    //     for (Integer num : nums) {
    //     //     if (num.equals(max1) || num.equals(max2) || num.equals(max3)) {
    //     //         break; // skip duplicates
    //     //     }
            
    //         if (max1 == null || num > max1) {
    //             max3 = max2;
    //             max2 = max1;
    //             max1 = (long) num;
    //         } else if (max2 == null || num > max2) {
    //             max3 = max2;
    //             max2 = (long) num;
    //         } else if (max3 == null || num > max3) {
    //             max3 = (long) num;
    //         }
    //     }
        
    //     return max3 == null ? max1.intValue() : max3.intValue();

    }
}