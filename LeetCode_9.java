class Solution {
    public boolean isPalindrome(int n) {
        int temp=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=(rev*10) + digit;
            n/=10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
}
