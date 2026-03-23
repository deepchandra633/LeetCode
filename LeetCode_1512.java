class Solution {
    public int numIdenticalPairs(int[] nums) {
       int count =0;
       int[] arr=new int[101];
       for(int num : nums){
        count +=arr[num];
        arr[num]++;
        
       }
        return count;
    }
}