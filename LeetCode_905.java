
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i] % 2 > nums[j] % 2){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        if(nums[i] % 2 == 0){
            i++;
        }
        if(nums[j] % 2 == 1){
            j--;
        }
        }
        return nums;


        // List<Integer> list=new ArrayList<>();
        // for(int i : nums){
        //     if(i % 2 == 0){
        //         list.add(i);
        //     }

        // }
        // int[] arr =new int[list.size()];
        //     int idx=0;
        //     for(int i : list){
        //         arr[idx]=list.get(i);
        //     }
        //     return arr;
    }
}