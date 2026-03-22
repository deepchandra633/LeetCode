
class Solution {
    public int strStr(String haystack, String needle) {

        // way 2
        int n=haystack.length();
        int m=needle.length();

        if(m==0){
            return 0;
        }

        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return i;
            }
        }

        return -1;


        // way 2
        // return haystack.indexOf(needle);
    }

}