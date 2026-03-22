class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
    
        while(i<arr.length){
            int value=arr[i];
            if(arr[i]<arr.length && arr[i] != arr[value]){
                swap(arr,i,value);
            }else{
                i++;
            }
        }
        // search missing number
        for(int index=0;index<arr.length;index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    // Arrays.sort(arr);
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i] != i){
    //         return i;
    //     }
    // }
    // return arr.length;
    }
}

