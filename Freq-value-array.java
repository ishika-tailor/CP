class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length/2;i++){
            int freq=nums[2*i];
            int val=nums[2*i+1];
            for(int j=0;j<freq;j++){
                list.add(val);
            }
        }
        int n=list.size();
        int[] ans =new int[n];
        for(int i=0;i<n;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}

//Input: nums = [1,2,3,4]
//Output: [2,4,4,4]
//Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
//The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
//At the end the concatenation [2] + [4,4,4] is [2,4,4,4].