import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        int n=s.length();
        int start=0,end=0;
        int maxlen=0;
        while(end<n){
            char ch=s.charAt(end);
            if(mp.containsKey(ch)){
                start=Math.max(start,mp.get(ch)+1);
            }
            mp.put(ch,end);
            maxlen=Math.max(maxlen,end-start+1);
            end++;
        }
        return maxlen;
    }
}
