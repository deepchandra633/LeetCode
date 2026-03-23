import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int idx=0;
        for(int i : nums){
            arr[idx]=i*i;
            idx++;
        }
        Arrays.sort(arr);
        return arr;

        // int [] arr=new int[nums.length];
        // int left=0;
        // int right=nums.length-1;
        // int i=nums.length-1;

        // while(left<=right){
        //     int lsq=nums[left] * nums[left];
        //     int rsq=nums[right] * nums[right];

        //     if(lsq>rsq){
        //         arr[i]=lsq;
        //         left++;
        //     }else{
        //         arr[i]=rsq;
        //         right--;
        //     }
        //     i--;
        // }
        // return arr;
    }
}