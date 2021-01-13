class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int out;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            out=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    out=out+1;
                }
            }
            ans[i]=out;
        }
        return ans;
    }
}

//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation: 
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 