
class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length;
        // Arrays.sort(nums);
        // int ans = 0;
        // for (int i = 0; i < n-1 ; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         ans = nums[i];
        //     }
        // }
        // return ans;

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correctValue = nums[i] - 1;
                if (nums[i] != nums[correctValue]) {
                    swap(nums, i, correctValue);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;

    }
    void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}