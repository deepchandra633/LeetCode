import java.util.*;
class Solution {
    public List<String> commonChars(String[] words) {
        int [] arr=new int [26];
        String firstWord=words[0];
        for(char ch :firstWord.toCharArray()){
            int idx=ch - 'a';
            arr[idx]++;
        }
        int n=words.length;
        for(int i=1;i<n;i++){
             int []curr=new int [26];
             String currWord=words[i];
        for(char ch :currWord.toCharArray()){
            int idx=ch - 'a';
            curr[idx]++;
        }
        for(int j=0; j<26;j++){
            arr[j]=Math.min(arr[j],curr[j]);
        }
        }
        List<String> result=new ArrayList<>();
        for(int j=0; j<26;j++){
            if(arr[j]!=0){
                char ch=(char)(j+97);
                int count =arr[j];
                while(count>0 ){
                    result.add(""+ch);
                    count--;
                }
            }

        }
        return result;
    }
}