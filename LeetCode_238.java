class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr =new int[n];

        // arr[0] hold kareda i ke left ka product
        arr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1] * nums[i-1];
        }

        // R ye i ke right ke product ko hold karega
        int R=1;
        for(int i=n-1;i>=0;i--){
            arr[i]=arr[i]*R;
            R*=nums[i];
        }
        return arr;
    }
}