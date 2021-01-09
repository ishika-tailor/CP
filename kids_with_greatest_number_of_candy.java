import java.util.List;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        List<Boolean> ans=new ArrayList<Boolean>();
        for(int i=1;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                ans.add(true);
            }
            else{
            ans.add(false);
            }
        }
    return ans;
    }
}

//leetcode kids with the greatest number of candy