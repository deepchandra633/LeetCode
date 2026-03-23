import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int maxCandies=0;
        for(int candy : candies){
            if(candy > maxCandies){
                maxCandies= candy;
            }
        }
        for(int candy : candies){
            list.add(candy +extraCandies >=  maxCandies);
        }
        return list;
    }
}