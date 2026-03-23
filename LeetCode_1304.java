class Solution {
    public int[] sumZero(int n) {
       
        int[] arr=new int[n];
        int idx=0;
        // if n is even we can use i,-i
        for(int i=1;i<=n/2;i++){
            arr[idx++]=i;
            arr[idx++]=-i;

        }
        // if n is odd we pot 0 at the last index
        if(n%2==1){
            arr[idx]=0;
        }
        return arr;
    }
}